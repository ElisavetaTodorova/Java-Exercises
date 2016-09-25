package exercises.methods.p02OldestFamilyMember;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

   public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %d",this.name,this.age);
    }
}
