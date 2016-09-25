package exesices.StaticMethods.p01Stufents;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public class Student {
    private String name;
    static public Integer studentInstances=0;

    public Student(String name) {
        this.name = name;
        studentInstances++;
    }
}
