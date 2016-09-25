package definingClassesHomework.p03OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class OpinionPoll {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());
        List<Person> peoples = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("[\\s]+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            peoples.add(new Person(name, age));
        }
        peoples.stream().filter(p -> p.age > 30)
                .sorted((x, y) -> x.name.compareTo(y.name))
                .forEach(s -> System.out.println(s.name + " - " + s.age));
    }
}
