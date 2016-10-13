package system.split.models.hardware;

import system.split.models.Component;
import system.split.models.software.Software;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
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

        if (currentCapacity <= this.maximumCapacity && currentMemory <= this.maximumMemory) {
            this.softwareComponents.put(software.getName(), software);
            this.currentCapacityUsage += software.getCapacityConsumption();
            this.currentMemoryUsage += software.getMemoryConsumption();
        }
    }

    public void removeSoftwareComponent(String softwareComponentName) {
        if (this.containsSoftwareComponent(softwareComponentName)) {
            Software software = this.softwareComponents.remove(softwareComponentName);
            this.currentMemoryUsage -= software.getMemoryConsumption();
            this.currentCapacityUsage -= software.getCapacityConsumption();
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

    public int getSoftwareComponentsCount() {
        return this.softwareComponents.size();
    }

    public int[] getExpressAndLightSoftwareCount() {
        int[] result = new int[2];
        int expressSoftwareCount = 0;
        int lightSoftwareCount = 0;
        for (Software software : softwareComponents.values()) {
            if (software.getType().equals("Light")) {
                lightSoftwareCount++;
            } else {
                expressSoftwareCount++;
            }
        }
        result[0] = expressSoftwareCount;
        result[1] = lightSoftwareCount;
        return result;
    }

    public List<String> getAllSoftwareComponentsNames (){
        List<String> result = new LinkedList<>();
        for (String name : softwareComponents.keySet()) {
            result.add(name);
        }
        return result;
    }

    private boolean containsSoftwareComponent(String softwareComponentName) {
        return this.softwareComponents.containsKey(softwareComponentName);
    }

}
