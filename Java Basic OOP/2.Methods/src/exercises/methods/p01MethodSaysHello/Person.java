package exercises.methods.p01MethodSaysHello;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public String saysHello(){
        //"<Person name> says Hello!".
        return String.format("%s says \"Hello\"!",this.name);
    }
}
