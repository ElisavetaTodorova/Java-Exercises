package p06Animals;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Kittens extends Cat implements Soundable {

    public Kittens(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound() {
        System.out.println("Miau");
    }
}
