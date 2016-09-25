package p02.models;


public class RoyalGuard extends Person {

    public RoyalGuard(String name) {
        super(name);
    }

    @Override
    public void handleAttack() {
        System.out.printf("Royal Guard %s is defending!%n", this.getName());
    }
}
