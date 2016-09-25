package p03Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] studentData = reader.readLine().split("\\s+");
            String[] workerData=reader.readLine().split("\\s+");
            String studentFistName=studentData[0];
            String studentSecondName=studentData[1];
            String studentFacultyNumber=studentData[2];
            Student student=new Student(studentFistName,studentSecondName,studentFacultyNumber);
            String workerFistName=workerData[0];
            String workerSecondName=workerData[1];
            double workerWeekSalary=Double.parseDouble(workerData[2]);
            double workerHoursPerDay=Double.parseDouble(workerData[3]);
            Worker worker=new Worker(workerFistName,workerSecondName,workerWeekSalary,workerHoursPerDay);
            System.out.println(student.toString());
            System.out.println(worker.toString());


        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

    }

}
