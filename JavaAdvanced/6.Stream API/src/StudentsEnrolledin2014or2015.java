import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentsEnrolledin2014or2015 {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String input = scanner.readLine();
        List<Student> students = new LinkedList<>();
        while (!input.equals("END")) {
            String[] fullName = input.split(" ");
            Student student = new Student(fullName[0]);
            student.marks = new LinkedList(Arrays.asList(Integer.parseInt(fullName[1]),
                    Integer.parseInt(fullName[2]), Integer.parseInt(fullName[3]),
                    Integer.parseInt(fullName[4])));
            students.add(student);
            input = scanner.readLine();
        }
        students=students.stream().filter(s -> s.facultyNumber.endsWith("14")
                || s.facultyNumber.endsWith("15"))
                .collect(Collectors.toList());
        for (Student student : students) {
            student.marks.stream().forEach(m-> System.out.print(m+" "));
            System.out.println();
        }
    }
}
