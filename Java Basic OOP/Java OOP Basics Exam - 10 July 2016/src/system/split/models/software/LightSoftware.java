package system.split.models.software;

/**
 * Created by ELISAV on 11.10.2016 г..
 */
public class LightSoftware extends Software {

    public LightSoftware(String name,String type, int capacityConsumption, int memoryConsumption) {
        super(name, type);
        this.setCapacityConsumption(capacityConsumption);
        this.setMemoryConsumption(memoryConsumption);
    }

    private void setCapacityConsumption(int capacityConsumption) {
        this.capacityConsumption = (int) (capacityConsumption + (capacityConsumption * 0.5));
    }

    private void setMemoryConsumption(int memoryConsumption) {
        this.memoryConsumption = (int) (memoryConsumption + (memoryConsumption * 0.5));
    }
}
