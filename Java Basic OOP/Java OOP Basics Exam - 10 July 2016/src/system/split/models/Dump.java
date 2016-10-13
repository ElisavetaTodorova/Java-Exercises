package system.split.models;

import system.split.models.hardware.Hardware;

import java.lang.*;
import java.lang.System;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ELISAV on 11.10.2016 г..
 */
public class Dump {

    private Map<String, Hardware> hardwareComponents;

    public Dump() {
        this.hardwareComponents = new HashMap<>();
    }

    public void dump(Hardware hardwareComponent) {
        this.hardwareComponents.put(hardwareComponent.getName(), hardwareComponent);
    }

    public Hardware restore(String hardwareComponentName) {
        Hardware hardware;
        if (this.hardwareComponents.containsKey(hardwareComponentName)) {
            hardware = this.hardwareComponents.remove(hardwareComponentName);
        } else {
            throw new IllegalArgumentException("No such element");
        }
        return hardware;
    }

    public void destroy(String hardwareComponentName) {
        if (this.hardwareComponents.containsKey(hardwareComponentName)) {
            this.hardwareComponents.remove(hardwareComponentName);
        }

    }


    public String dumpAnalyze() {
        StringBuilder result = new StringBuilder();
        int[] count = countOfAllTypesComponentsAndAllDumpedMemoryAndCapacity();
        result.append("Dump Analysis")
                .append(java.lang.System.lineSeparator())
                .append("Power Hardware Components: ")
                .append(count[0])
                .append(java.lang.System.lineSeparator())
                .append("Heavy Hardware Components: ")
                .append(count[1])
                .append(System.lineSeparator())
                .append("Express Software Components: ")
                .append(count[2])
                .append(System.lineSeparator())
                .append("Light Software Components: ")
                .append(count[3])
                .append(System.lineSeparator())
                .append("Total Dumped Memory: ")
                .append(count[4])
                .append(System.lineSeparator())
                .append("Total Dumped Capacity: ")
                .append(count[5]);
        return result.toString();
    }

    /*
    first cell is power hardware count
    second cell is heavy hardware count
    third cell is express software count
    fourth cell is light software count
    fifth cell is dumped memory
    sixth cell is dumped capacity
     */
    private int[] countOfAllTypesComponentsAndAllDumpedMemoryAndCapacity() {
        int[] result = new int[6];
        int powerHardwareCount = 0;
        int heavyHardwareCount = 0;
        int expressSoftwareCount = 0;
        int lightSoftwareCount = 0;
        int dumpedMemory = 0;
        int dumpedCapacity = 0;
        for (Hardware hardware : hardwareComponents.values()) {
            if (hardware.getType().equals("Heavy")) {
                heavyHardwareCount++;
            } else {
                powerHardwareCount++;
            }
            int [] softwareCount = hardware.getExpressAndLightSoftwareCount();
            expressSoftwareCount += softwareCount[0];
            lightSoftwareCount += softwareCount[1];
            dumpedMemory += hardware.getCurrentMemoryUsage();
            dumpedCapacity += hardware.getCurrentCapacityUsage();
        }
        result[0] = powerHardwareCount;
        result[1] = heavyHardwareCount;
        result[2] = expressSoftwareCount;
        result[3] = lightSoftwareCount;
        result[4] = dumpedMemory;
        result[5] = dumpedCapacity;
        return result;
    }


}
