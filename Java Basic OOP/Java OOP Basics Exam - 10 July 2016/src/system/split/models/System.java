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
            case "Heavy":
                hardware = new HeavyHardware(name, type, maximumCapacity, maximumMemory);
                break;
            case "Power":
                hardware = new PowerHardware(name, type, maximumCapacity, maximumMemory);
                break;
        }
        if (!this.hardwareComponents.containsKey(name)) {
            this.hardwareComponents.put(name, hardware);
        }
    }

    public void registerSoftware(String hardwareComponentName, String name, String type, int capacityConsumption, int
            memoryConsumption) {
        Software software = null;
        switch (type) {
            case "Light":
                software = new LightSoftware(name, type, capacityConsumption, memoryConsumption);
                break;
            case "Express":
                software = new ExpressSoftware(name, type, capacityConsumption, memoryConsumption);
                break;
        }

        if (this.hardwareComponents.containsKey(hardwareComponentName)) {
            this.hardwareComponents.get(hardwareComponentName).registerSoftwareComponent(software);
        }
    }

    public void releaseSoftwareComponentName(String hardwareComponentName, String softwareComponentName) {
        if (this.hardwareComponents.containsKey(hardwareComponentName)) {
            this.hardwareComponents.get(hardwareComponentName).removeSoftwareComponent(softwareComponentName);
        }
    }

    public String analyze() {
        StringBuilder result = new StringBuilder();
        result.append("System Analysis")
                .append(java.lang.System.lineSeparator())
                .append("  Hardware Components: ")
                .append(this.hardwareComponents.size())
                .append(java.lang.System.lineSeparator())
                .append("Software Components: ")
                .append(this.getSoftwareComponentsCount())
                .append(java.lang.System.lineSeparator())
                .append("Total Operational Memory: ")
                .append(this.totalUsedOperationMemory).append(" / ")
                .append(this.totalOperationMemory).append(java.lang.System.lineSeparator())
                .append("Total Capacity Taken: ")
                .append(this.totalUsedCapacity).append(" / ")
                .append(this.totalCapacity);

        return result.toString();
    }

    private int getSoftwareComponentsCount() {
        int count = 0;
        for (Hardware hardware : hardwareComponents.values()) {
            count += hardware.getSoftwareComponentsCount();
        }
        return count;
    }

    public String systemSplit() {
        StringBuilder result = new StringBuilder();
        this.hardwareComponents.entrySet()
                .stream()
                .sorted((h1, h2) -> {
                    int index = 0;
                    if (!(h1.getValue().getType().equals(h2.getValue().getType()))) {
                        index = h1.getValue().getType().equals("Power") ? -1 : 1;
                    }
                    return index;
                })
                .forEach(hardwareComponent -> {
                    int[] counts = hardwareComponent.getValue().getExpressAndLightSoftwareCount();
                    int expressSoftwareCount = counts[0];
                    int lightSoftwareCounts = counts[1];
                    result.append("Hardware component - ")
                            .append(hardwareComponent.getKey())
                            .append(java.lang.System.lineSeparator())
                            .append("Express Software Components - ")
                            .append(expressSoftwareCount)
                            .append(java.lang.System.lineSeparator())
                            .append("Light Software Components - ")
                            .append(lightSoftwareCounts)
                            .append(java.lang.System.lineSeparator())
                            .append("Memory Usage: ").append(hardwareComponent.getValue().getCurrentMemoryUsage())
                            .append(" / ")
                            .append(hardwareComponent.getValue().getMaximumCapacity())
                            .append(java.lang.System.lineSeparator())
                            .append("Capacity Usage: ").append(hardwareComponent.getValue().getCurrentCapacityUsage())
                            .append(" / ").append(hardwareComponent.getValue().getMaximumCapacity())
                            .append(java.lang.System.lineSeparator())
                            .append("Type: ").append(hardwareComponent.getValue().getType())
                            .append(java.lang.System.lineSeparator())
                            .append("Software Components: ");
                    if (hardwareComponent.getValue().getSoftwareComponentsCount() != 0) {
                        result.append(String.join(", ",hardwareComponent.getValue().getAllSoftwareComponentsNames()));
                    } else {
                        result.append("None");
                    }
                });

        return result.toString();
    }


}
