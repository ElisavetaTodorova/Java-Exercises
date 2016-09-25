package p07CompanyHierarchy;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Employee extends Person{
    private double salary;
    private Department department;

    public Employee(String id, String firsName, String secondName,double salary,Department department) {
        super(id, firsName, secondName);
        setSalary(salary);
        this.department=department;
    }

    private void setSalary(double salary) {
        if(salary<0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.salary = salary;
    }
}
