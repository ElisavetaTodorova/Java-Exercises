import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class StudentsByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        LinkedList<Student> students = new LinkedList<>();
        while (!line.equals("END")) {
            String[] information = line.split(" ");
            Student student = new Student(information[0], information[1], Integer.parseInt(information[2]));
            students.add(student);
            line = reader.readLine();

        }
        students.stream().filter(s -> s.group >= 18 && s.group <= 24)
                .forEach(s -> System.out.println(s.firstName + " " + s.secondName + " " + s.group));
    }
}
