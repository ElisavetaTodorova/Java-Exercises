import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentsByFirstAndLastName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        List<Student> students=new LinkedList<>();
        while (!input.equals("END")){
            String[]fullName=input.split(" ");
            students.add(new Student(fullName[0],fullName[1],0));
            input=scanner.nextLine();
        }
        students.stream().filter(s->s.firstName.compareTo(s.secondName)<0)
                .forEach(s-> System.out.println(s.firstName+" "+s.secondName));
    }
}
