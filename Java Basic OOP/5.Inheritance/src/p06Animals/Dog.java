package p06Animals;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Dog extends Animal implements Soundable{

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound() {
        System.out.println("BauBau");
    }
}
