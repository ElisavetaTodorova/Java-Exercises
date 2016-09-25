import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> students = new LinkedList<>();
        while (!input.equals("END")) {
            String[] fullName = input.split(" ");
            students.add(new Student(fullName[0], fullName[1], 0));
            input = scanner.nextLine();
        }
        students.stream().sorted((x, y) -> y.firstName.compareTo(x.secondName))
                .sorted((x, y) -> x.secondName.compareTo(y.secondName))
                .forEach(s -> System.out.println(s.firstName + " " + s.secondName));


    }
}
