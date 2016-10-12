package system.split.models;

import system.split.models.hardware.Hardware;
import system.split.models.hardware.HeavyHardware;
import system.split.models.hardware.PowerHardware;
import system.split.models.software.ExpressSoftware;
import system.split.models.software.LightSoftware;
import system.split.models.software.Software;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ELISAV on 11.10.2016 г..
 */
public class System {

    private Map<String, Hardware> hardwareComponents;
    private Dump dump;
    private int totalOperationMemory;
    private int totalUsedOperationMemory;
    private int totalCapacity;
    private int totalUsedCapacity;

    private System() {
        this.hardwareComponents = new HashMap<>();
        this.dump = new Dump();
        this.totalOperationMemory = 0;
        this.totalUsedOperationMemory = 0;
        this.totalCapacity = 0;
        this.totalUsedCapacity = 0;
    }

    private void calculateMemory() {
        for (Hardware hardware : hardwareComponents.values()) {
            this.totalOperationMemory += hardware.getMaximumMemory();
            this.totalUsedOperationMemory += hardware.getCurrentMemoryUsage();
        }
    }

    private void calculateCapacity() {
        for (Hardware hardware : hardwareComponents.values()) {
            this.totalCapacity += hardware.getMaximumCapacity();
            this.totalUsedCapacity += hardware.getCurrentCapacityUsage();
        }
    }

    public void registerHardware(String name, String type, int maximumCapacity, int maximumMemory) {
        Hardware hardware = null;
        switch (type) {
            case "HeavyHardware":
                hardware = new HeavyHardware(name, type, maximumCapacity, maximumMemory);
                break;
            case "PowerHardware":
                hardware = new PowerHardware(name, type, maximumCapacity, maximumMemory);
                break;
        }
        if (!this.hardwareComponents.containsKey(name)) {
            this.hardwareComponents.put(name, hardware);
        }
    }

    public void registerSoftware(String hardwareComponentName, String name, String type, int capacityConsumption, int memoryConsumption) {
        Software software = null;
        switch (type) {
            case "LightSoftware":
                software = new LightSoftware(name, type, capacityConsumption, memoryConsumption);
                break;
            case "ExpressSoftware":
                software = new ExpressSoftware(name, type, capacityConsumption, memoryConsumption);
                break;
        }

        if(this.hardwareComponents.containsKey(hardwareComponentName)) {
            this.hardwareComponents.get(hardwareComponentName).registerSoftwareComponent(software);
        }
    }
}
