package system.split.models.hardware;

import system.split.models.Component;
import system.split.models.software.Software;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ELISAV on 11.10.2016 г..
 */
public abstract class Hardware extends Component {

    int maximumCapacity;
    int maximumMemory;
    private int currentCapacityUsage;
    private int currentMemoryUsage;
    private Map<String, Software> softwareComponents;

    Hardware(String name, String type) {
        super(name, type);
        this.softwareComponents = new HashMap<>();
    }

    public void registerSoftwareComponent(Software software) {
        int currentCapacity = this.currentCapacityUsage + software.getCapacityConsumption();
        int currentMemory = this.currentMemoryUsage + software.getMemoryConsumption();

        if (currentCapacity <= this.maximumCapacity && currentMemory <= this.maximumCapacity) {
            this.softwareComponents.put(software.getName(), software);
            this.currentCapacityUsage += software.getCapacityConsumption();
            this.currentMemoryUsage += software.getMemoryConsumption();
        }
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public int getMaximumMemory() {
        return maximumMemory;
    }

    public int getCurrentCapacityUsage() {
        return currentCapacityUsage;
    }

    public int getCurrentMemoryUsage() {
        return currentMemoryUsage;
    }
}
