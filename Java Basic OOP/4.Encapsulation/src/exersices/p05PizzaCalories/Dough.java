package exersices.p05PizzaCalories;

/**
 * Created by ELISAV on 4.9.2016 г..
 */
public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;


    public Dough(String flourType, String bakingTechnique,double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }


    private void setFlourType(String flourType) {
        flourType = flourType.toLowerCase();
        if (flourType.equals("white") || flourType.equals("wholegrain")) {

            this.flourType = flourType;

        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

    }

    private void setBakingTechnique(String bakingTechnique) {
        bakingTechnique = bakingTechnique.toLowerCase();
        if (bakingTechnique.equals("crispy")
                || bakingTechnique.equals("chewy")
                || bakingTechnique.equals("homemade")) {

            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }


    public double getDoughCalories(){
        double flourTypeCalories=0.0;
        double bakingTechniqueCalorie=0.0;
        switch (this.flourType){
            case "white":flourTypeCalories=1.5;
                break;
            case "wholegrain":flourTypeCalories=1.0;
                break;

        }
        switch (this.bakingTechnique){
            case "crispy":bakingTechniqueCalorie=0.9;
                break;
            case "chewy":bakingTechniqueCalorie=1.1;
                break;
            case "homemade":bakingTechniqueCalorie=1.0;
                break;
        }
        double doughTotalCalories=2*this.weight*flourTypeCalories*bakingTechniqueCalorie;
        return doughTotalCalories;
    }
}
