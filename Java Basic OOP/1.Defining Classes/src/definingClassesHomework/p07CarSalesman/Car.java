package definingClassesHomework.p07CarSalesman;


public class Car {
    //. A Car has a model, engine, weight and color.
    //Optional weight,color
    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine) {
        this(model,engine,"n/a","n/a");
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //<CarModel>:
//  <EngineModel>:
//    Power: <EnginePower>
//    Displacement: <EngineDisplacement>
//    Efficiency: <EngineEfficiency>
//   Weight: <CarWeight>
//   Color: <CarColor>


    @Override
    public String toString() {
        return String.format("%s:%n  %s:%n" +
                "   Power: %d%n" +
                "   Displacement: %s%n" +
                "   Efficiency: %s%n" +
                "  Weight: %s%n" +
                "  Color: %s",this.model,this.engine.getModel(),this.engine.getPower(),this.engine.getDisplacement(),
                                this.engine.getEfficiency(),this.weight,this.color);
    }
}
