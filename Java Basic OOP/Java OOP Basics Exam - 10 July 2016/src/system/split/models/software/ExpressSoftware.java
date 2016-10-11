package system.split.models.software;

/**
 * Created by ELISAV on 11.10.2016 г..
 */
public class ExpressSoftware extends Software {

    protected ExpressSoftware(String name, String type, int capacityConsumption,int memoryConsumption) {
        super(name, type);
        this.setCapacityConsumption(capacityConsumption);
        this.setMemoryConsumption(memoryConsumption);
    }

    private void setCapacityConsumption(int capacityConsumption) {
        this.capacityConsumption = capacityConsumption;
    }

    private void setMemoryConsumption(int memoryConsumption) {
        this.memoryConsumption = memoryConsumption * 2;
    }
}
