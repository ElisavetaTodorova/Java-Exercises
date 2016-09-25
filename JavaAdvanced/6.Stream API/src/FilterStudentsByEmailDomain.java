import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FilterStudentsByEmailDomain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        List<Student> students=new LinkedList<>();
        while (!input.equals("END")){
            String[]fullName=input.split(" ");
            Student student=new Student(fullName[0],fullName[1],0);
            student.emailAddress=fullName[2];
            students.add(student);
            input=scanner.nextLine();
        }
        students.stream().filter(s->s.emailAddress.endsWith("@gmail.com"))
                .forEach(s-> System.out.println(s.firstName+" "+s.secondName));
    }
}
