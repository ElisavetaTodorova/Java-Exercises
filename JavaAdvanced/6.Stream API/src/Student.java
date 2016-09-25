import java.util.LinkedList;

public class Student implements Comparable<Student>{
    public String firstName;
    public  String secondName;
    public Integer group;
    public String emailAddress;
    public String phoneNumber;
    public LinkedList<Integer> marks;
    public String facultyNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Student(String facultyNumber, String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.facultyNumber=facultyNumber;
    }

    public Student(String facultyNumber ) {
        this.facultyNumber = facultyNumber;
    }

    public Student(String firstName, String secondName, Integer group) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.group = group;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", group=" + group +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.firstName.compareTo(student.firstName);

    }


}

