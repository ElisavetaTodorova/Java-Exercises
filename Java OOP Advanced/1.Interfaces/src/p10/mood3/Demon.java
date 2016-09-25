package p10.mood3;

/**
 * Created by ELISAV on 8.9.2016 г..
 */
public class Demon extends GameObjectsImpl {

    private double energy;
    public Demon(String username, int level,double energy) {
        super(username, level);
        this.setEnergy(energy);

    }

    private void setEnergy(double energy) {
        this.energy = energy;
    }

    @Override
    public String getHashedPassword() {

        String result=(this.getUserName().length()*217)+"";

        return result;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> Demon\n%.1f",this.getUserName(),this.getHashedPassword(),
                                                    this.energy*this.getLevel());
    }
}
