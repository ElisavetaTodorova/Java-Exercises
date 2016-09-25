package p06Animals;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Cat extends Animal implements Soundable {

    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound() {
        System.out.println("MiauMiau");
    }
}
