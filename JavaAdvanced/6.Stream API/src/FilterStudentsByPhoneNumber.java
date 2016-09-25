import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterStudentsByPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> students = new LinkedList<>();
        while (!input.equals("END")) {
            String[] fullName = input.split(" ");
            Student student = new Student(fullName[0], fullName[1], 0);
            student.phoneNumber = fullName[2];
            students.add(student);
            input = scanner.nextLine();
        }
        students.stream().filter(s -> isValid(s.phoneNumber))
                .forEach(s -> System.out.println(s.firstName + " " + s.secondName));
    }

    static boolean isValid(String phone) {
        Pattern pattern = Pattern.compile("^02|\\+3592");
        Matcher matcher = pattern.matcher(phone);
        return matcher.find();
    }
}
