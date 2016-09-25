import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExellentStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> students = new LinkedList<>();
        while (!input.equals("END")) {
            String[] fullName = input.split(" ");
            Student student = new Student(fullName[0], fullName[1], 0);
            student.marks = new LinkedList(Arrays.asList(Integer.parseInt(fullName[2]),
                    Integer.parseInt(fullName[3]), Integer.parseInt(fullName[4]),
                    Integer.parseInt(fullName[5])));
            students.add(student);
            input = scanner.nextLine();
        }
        students.stream().filter(s -> s.marks.contains(6))
                .forEach(s -> System.out.println(s.firstName + " " + s.secondName));
    }
}
