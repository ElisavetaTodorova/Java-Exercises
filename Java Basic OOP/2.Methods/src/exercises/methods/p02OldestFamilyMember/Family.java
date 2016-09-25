package exercises.methods.p02OldestFamilyMember;

import java.util.LinkedList;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class Family {
    private LinkedList<Person> people;

    public Family(){
        this.people=new LinkedList<>();
    }

    public void addFamilyMember(Person person){
        this.people.add(person);
    }

    public LinkedList<Person> getPeople() {
        return people;
    }

    public Person getOldestMember(){
        return people.stream()
                .sorted((p1,p2)->p2.getAge().compareTo(p1.getAge()))
                .findFirst()
                .get();
    }

}
