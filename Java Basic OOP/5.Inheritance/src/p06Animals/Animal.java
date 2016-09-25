package p06Animals;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Animal implements Soundable {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    private void setName(String name) {
        char [] n=name.toCharArray();
        for (char c : n) {
            if(Character.isDigit(c)){
                throw new IllegalArgumentException("Invalid input!");
            }
        }
        if(name.isEmpty() || name==null){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if(age<0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    private void setGender(String gender) {
        char [] n=gender.toCharArray();
        for (char c : n) {
            if(Character.isDigit(c)){
                throw new IllegalArgumentException("Invalid input!");
            }
        }
        if(gender.isEmpty() || gender==null){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    @Override
    public void produceSound() {
        System.out.println("Not implemented!");
    }

    @Override
    public String toString() {
        StringBuilder result=new StringBuilder();
        result.append(this.name+" ").append(this.age+" ").append(this.gender);
        return result.toString();

    }
}
