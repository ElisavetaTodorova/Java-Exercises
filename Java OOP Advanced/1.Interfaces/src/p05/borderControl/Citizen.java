package p05.borderControl;


public class Citizen extends Inhabitant implements Birth, Buyer {

    private int age;
    private String birthDate;
    private int foodCount;

    public Citizen(String name, int age, String id, String birthDate) {
        super(name, id);
        this.setAge(age);
        this.setBirthDate(birthDate);
        this.foodCount = 0;
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    private void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public boolean hasSameYearOfBirth(String date) {
        if (this.birthDate.endsWith(date)) {
            return true;
        }
        return false;
    }

    @Override
    public void buyFood() {


            this.foodCount += 10;

    }

    @Override
    public int getTotalFoodCount() {
        return this.foodCount;
    }
}
