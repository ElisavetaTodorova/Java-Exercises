import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGroup {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        List<Student> students = new LinkedList<>();
        while (!line.equals("END")) {
            String[] information = line.split(" ");
            Student student = new Student(information[0], information[1], Integer.parseInt(information[2]));
            students.add(student);
            line = reader.readLine();

        }
        Map<Integer, List<Student>> result = students.stream()
                .collect(Collectors.groupingBy(student -> student.group));
        for (Map.Entry<Integer, List<Student>> entry : result.entrySet()) {

            {
                System.out.print(entry.getKey() + " - ");
                for (int i = 0; i < entry.getValue().size(); i++) {

                    if (i == entry.getValue().size() - 1) {
                        System.out.println(entry.getValue().get(i).firstName + " " + entry.getValue().get(i).secondName);
                    } else {

                        System.out.print(entry.getValue().get(i).firstName + " " + entry.getValue().get(i).secondName + ", ");
                    }
                }

            }


        }
    }
}
