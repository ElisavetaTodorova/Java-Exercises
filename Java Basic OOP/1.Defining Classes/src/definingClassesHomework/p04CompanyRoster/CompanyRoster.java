package definingClassesHomework.p04CompanyRoster;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CompanyRoster {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Double> departmentSalaty = new HashMap<>();
        HashMap<String, TreeSet<Employee>> departmentEmploees = new HashMap<>();

        int n = Integer.valueOf(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] params = reader.readLine().split("\\s+");
            Employee employee = null;
            //name, salary, position and department
            String name=params[0];
            Double salary=Double.valueOf(params[1]);
            String position=params[2];
            String department=params[3];
            if (params.length == 4) {
                employee=new Employee(name,salary,position,department);
            }else if(params.length==5){
                boolean isAge=isAgeConstructor(params[4]);

                if(isAge){
                    int age=Integer.parseInt(params[4]);
                    employee=new Employee(name,salary,position,department,"n/a",age);
                }else {
                    String email=params[4];
                    employee=new Employee(name,salary,position,department,email,-1);
                }

            }else {
                String email=params[4];
                int age=Integer.parseInt(params[5]);
                employee=new Employee(name,salary,position,department,email,age);
            }
            if(!departmentEmploees.containsKey(department)){
                departmentEmploees.put(department,new TreeSet<>());
                departmentSalaty.put(department,0.0);
            }
            departmentEmploees.get(department).add(employee);
            departmentSalaty.put(department,departmentSalaty.get(department)+salary);
        }
        Map.Entry<String,TreeSet<Employee>> best=departmentEmploees.entrySet().stream()
                .sorted((e1,e2)->Double.compare(departmentSalaty.get(e2.getKey()),departmentSalaty.get(e1.getKey())))
                .findFirst().get();
        System.out.printf("Highest Average Salary: %s%n",best.getKey());
        for (Employee employee : best.getValue()) {
            System.out.println(employee);
        }
    }

    private static boolean isAgeConstructor(String param) {
        try {
            Integer.parseInt(param);

        }catch (NumberFormatException ex){
            return false;
        }
        return true;
    }
}
