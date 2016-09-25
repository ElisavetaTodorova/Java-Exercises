package p07;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        HashSet<Person> hashSet=new HashSet<>();
        TreeSet<Person> treeSet=new TreeSet<>();
        int n=Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[]params=reader.readLine().split("\\s+");
            String name=params[0];
            int age=Integer.parseInt(params[1]);
            Person person=new Person(name,age);
            hashSet.add(person);
            treeSet.add(person);
        }
        System.out.println(hashSet.size());
        System.out.println(treeSet.size());

    }

}
