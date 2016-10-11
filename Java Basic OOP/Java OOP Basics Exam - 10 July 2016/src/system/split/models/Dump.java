package system.split.models;

import system.split.models.hardware.Hardware;

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



}
