package exesices.StaticMethods.p02UniqueStudentNames;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public class Student {
    private String name;
    public static StudentGroup group;
    static {
        group=new StudentGroup();
    }
    public Student(String name) {
        this.name = name;
        group.addStudent(name);

    }


}
