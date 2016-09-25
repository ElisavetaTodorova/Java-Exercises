package definingClassesHomework.p09Google;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class Relatives {
    //children <childName> <childBirthday>”
    private String relativeName;
    private String relativeBirthday;

    public Relatives(String relativeName, String relativeBirthday) {
        this.relativeName = relativeName;
        this.relativeBirthday = relativeBirthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.relativeName,this.relativeBirthday);
    }
}
