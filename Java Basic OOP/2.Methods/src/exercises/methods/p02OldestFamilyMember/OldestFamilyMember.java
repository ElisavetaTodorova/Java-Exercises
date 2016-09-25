package exercises.methods.p02OldestFamilyMember;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OldestFamilyMember {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Family family = new Family();
        for (int i = 0; i < n; i++) {
            String[] params = reader.readLine().split("\\s+");
            String name=params[0];
            Integer age=Integer.parseInt(params[1]);
            Person person=new Person(name,age);
            family.getPeople().add(person);

        }
        System.out.println(family.getOldestMember());
//        Method getOldestMethod = Class.forName("Family").getMethod("getOldestMember");
//        Method addMemberMethod =Class.forName("Family").getMethod("addFamilyMember",Person.class);


    }

}
