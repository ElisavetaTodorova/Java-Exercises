package p02.models;


public class Footman extends Person {

    public Footman(String name) {
        super(name);
    }

    @Override
    public void handleAttack() {
        System.out.printf("Footman %s is panicking!%n",this.getName());
    }
}
