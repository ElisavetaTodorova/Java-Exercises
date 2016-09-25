package p05.borderControl;


public class Rebel implements Buyer{

    private String name;
    private int age;
    private String group;
    private int foodCount;

    public Rebel(String name, int age, String group) {

        this.setName(name);
        this.setAge(age);
        this.setGroup(group);
        this.foodCount=0;

    }

    private void setName(String name) {

        if (!name.isEmpty() && !(name == null)) {

            this.name = name;
        }

    }

    private void setAge(int age) {

        if (age >= 0) {
            this.age = age;
        }

    }

    private void setGroup(String group) {
        if (!group.isEmpty() && !(group == null)) {

            this.group = group;
        }

    }

    @Override
    public void buyFood() {

            this.foodCount += 5;

    }

    @Override
    public int getTotalFoodCount() {
        return this.foodCount;
    }
}
