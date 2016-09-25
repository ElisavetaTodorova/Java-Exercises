package pr02MultipleImplementation;

/**
 * Created by ELISAV on 7.9.2016 г..
 */
public class Citizen implements Person,Identifiable,Birthable {

    private String name;
    private int age;
    private String id;
    private String birthDate;



    public Citizen(String name, int age, String id, String birthDate) {
        setName(name);
        setAge(age);
        setId(id);
        setBirthDate(birthDate);
    }



    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }
    private void setId(String id) {
        this.id = id;
    }

    private void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }



    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
