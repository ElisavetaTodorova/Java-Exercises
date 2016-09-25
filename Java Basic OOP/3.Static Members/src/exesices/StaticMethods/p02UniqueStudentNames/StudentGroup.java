package exesices.StaticMethods.p02UniqueStudentNames;

import java.util.HashSet;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public class StudentGroup {
    public  HashSet<String > students;
    private static Integer counter;

    static {
        counter=0;
    }

    public StudentGroup() {
        this.students = new HashSet<>();

    }
    public void addStudent(String studentName){
        this.students.add(studentName);
        counter=this.students.size();
    }

    public  Integer getCounter() {
        return counter;
    }
}
