package p05;


public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.setName(name);
        this.setAge(age);
        this.setTown(town);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setTown(String town) {
        this.town = town;
    }

    @Override
    public int compareTo(Person person) {
        if (this.name.equals(person.name)
                && this.age == person.age
                && this.town.equals(person.town)) {
            return 0;
        }
        return -1;
    }
}
