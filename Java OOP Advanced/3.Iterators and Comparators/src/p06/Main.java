package p06;


import p06.interfaces.AgeComparable;
import p06.interfaces.NameComparable;
import p06.models.AgeComparableImpl;
import p06.models.NameComparableImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        TreeSet<NameComparable> nameComparablePeoples=new TreeSet<>();
        TreeSet<AgeComparable> ageComparablePeople=new TreeSet<>();
        int n=Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {

            String[]params=reader.readLine().split("\\s+");
            String name=params[0];
            int age=Integer.parseInt(params[1]);
            NameComparableImpl person1=new NameComparableImpl(name,age);
            AgeComparableImpl person2=new AgeComparableImpl(name,age);
            nameComparablePeoples.add(person1);
            ageComparablePeople.add(person2);

        }
       nameComparablePeoples.stream()
               .forEach(System.out::println);

        ageComparablePeople.stream()
                .forEach(System.out::println);



    }

}
