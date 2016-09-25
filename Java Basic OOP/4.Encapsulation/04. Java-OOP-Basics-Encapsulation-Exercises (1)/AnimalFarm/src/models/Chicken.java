package models;

public class Chicken {
    final int MIN_AGE = 0;
    public int MAX_AGE = 15;

    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void setName(String name) {
        if (name.isEmpty() || name.trim().length() == 0 || name==null) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double getProductPerDay() {
        return this.calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        switch (this.age) {
            case 0:
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
            case 7:
                return 3;
            case 8:
            case 9:
            case 10:
            case 11:
                return 2;
            default:
                return 1;
        }
    }
}
