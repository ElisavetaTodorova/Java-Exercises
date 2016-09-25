import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class StudentsByGroup {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String line=reader.readLine();
        LinkedList<Student>students=new LinkedList<>();
        while (!line.equals("END")){
            String[] information=line.split(" ");
            Student student=new Student(information[0],information[1],Integer.parseInt(information[2]));
            students.add(student);
            line=reader.readLine();

        }
        students.stream().filter(stud->stud.group==2)
                .sorted()
                .forEach(s-> System.out.println(s.firstName+" "+s.secondName));


    }

}
