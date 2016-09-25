import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class StudentsJoinedtoSpecialties {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        Set<Student> students = new TreeSet<>();
        Queue<StudentSpeciality> specialities = new LinkedList<>();
        LinkedHashSet<String>numbers=new LinkedHashSet<>();
        while (!line.equals("Students:")) {
            String[] input = line.split("\\s+");
            StudentSpeciality speciality = new StudentSpeciality(input[0] + " " + input[1], input[2]);
            specialities.add(speciality);
            numbers.add(input[2]);
            line = reader.readLine();
        }

        line = reader.readLine();

        while (!line.equals("END")) {

            String[] input = line.split("\\s+");
            Student student = new Student(input[0], input[1], input[2]) ;
            students.add(student);
            line = reader.readLine();
        }

        Map<String,List<StudentSpeciality>> groupedSpecialities=specialities.stream()
                .collect(Collectors.groupingBy(s->s.facultyNumber));
        Map<String,String> grouped=students.stream()
                .collect(Collectors.toMap
                        (Student::getFacultyNumber, s->s.getFirstName()+" "+s.getSecondName()));
        for (Map.Entry<String, String> entry : grouped.entrySet()) {
            System.out.println(entry.getValue());
        }
//        for (String number : numbers) {
//            for (StudentSpeciality s : groupedSpecialities.get(number)) {
//                System.out.print(grouped.get(number));
//                System.out.print(" "+number+" ");
//                System.out.println(s.specialityName);
//            }
//        }

    }
}
