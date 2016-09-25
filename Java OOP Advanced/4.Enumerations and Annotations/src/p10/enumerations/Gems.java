package p10.enumerations;


public enum Gems {
    RUBY(7, 2, 5),
    EMERALD(1, 4, 9),
    AMETHYST(2, 8, 4);
    private int strength;
    private int agility;
    private int vitality;

    Gems(int strength, int agility, int vitality) {
        this.strength = strength;
        this.agility = agility;
        this.vitality = vitality;
    }

    public int getStrength() {
        return strength;
    }

    private void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    private void setAgility(int agility) {
        this.agility = agility;
    }

    public int getVitality() {
        return vitality;
    }

    private void setVitality(int vitality) {
        this.vitality = vitality;
    }
}
