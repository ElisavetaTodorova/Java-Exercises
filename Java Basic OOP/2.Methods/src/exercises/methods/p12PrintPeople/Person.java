package exercises.methods.p12PrintPeople;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public class Person implements Comparable<Person>{
    private String name;
    private Integer age;
    private String occupation;

    public Person(String name, Integer age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Person person) {
        return this.age.compareTo(person.getAge());
    }

    @Override
    public String toString() {
        //Mimi - age: 13, occupation: Student
        return String.format("%s - age: %d, occupation: %s",
                            this.name,this.age,this.occupation);
    }
}
