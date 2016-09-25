package p06.models;


public  abstract class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }






    @Override
    public int compareTo(Person person) {

        return 0;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}
