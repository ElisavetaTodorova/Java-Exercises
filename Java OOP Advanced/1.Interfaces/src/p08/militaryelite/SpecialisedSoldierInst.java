package p08.militaryelite;


public abstract class SpecialisedSoldierInst extends Private implements SpecialisedSoldier {

    private String corps;

    public SpecialisedSoldierInst(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }


    private void setCorps(String corps) {

        if (isValidCorps(corps)) {
            this.corps = corps;
        }
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(super.toString())
                .append("Corps: ").append(this.corps)
                .append(System.lineSeparator());


        return stringBuilder.toString();
    }
}
