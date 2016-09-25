package p02.models;


public class King extends Person {

    public King(String name) {
        super(name);
    }

    @Override
    public void handleAttack() {
        System.out.printf("King %s is under attack!%n",this.getName());
    }
}
