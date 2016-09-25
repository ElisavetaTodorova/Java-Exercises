package p06Animals;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Tomcat extends Cat implements Soundable {

    public Tomcat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound() {
        System.out.println("Give me one million b***h");
    }
}
