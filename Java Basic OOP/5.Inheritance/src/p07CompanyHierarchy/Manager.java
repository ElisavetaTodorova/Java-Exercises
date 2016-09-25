package p07CompanyHierarchy;

import java.util.HashSet;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Manager extends Employee {
    private HashSet<Employee> employees;


    private Manager(String id, String firsName, String secondName, double salary, Department department,
                    HashSet<Employee> employees) {
        super(id, firsName, secondName, salary, department);
        this.employees = employees;
    }
}
