package system.split.models;

import system.split.models.hardware.Hardware;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ELISAV on 13.10.2016 г..
 */
public class InformationProcessor {

    private System system;

    public InformationProcessor() {
        this.system = new System();
    }

    public String proceedInformation(String information) {
        String result = null;
        String operation = null;
        Pattern patternForMatchingTheParametersInsideBrackets = Pattern.compile("\\(([A-Za-z0-9\\,\\s+]+)\\)");
        Matcher matcher = patternForMatchingTheParametersInsideBrackets.matcher(information);
        int indexOfFirstBracket = information.indexOf('(');
        if (indexOfFirstBracket != -1) {
            operation = information.substring(0, indexOfFirstBracket);
            String[] params = null;
            if (matcher.find()) {
                params = matcher.group(1).split("[, ]+");
            }
            switch (operation) {
                case "RegisterPowerHardware": {
                    String name = params[0];
                    int capacity = Integer.parseInt(params[1]);
                    int memory = Integer.parseInt(params[2]);
                    String type = "Power";
                    this.system.registerHardware(name, type, capacity, memory);
                }
                break;
                case "RegisterHeavyHardware": {
                    String name = params[0];
                    int capacity = Integer.parseInt(params[1]);
                    int memory = Integer.parseInt(params[2]);
                    String type = "Heavy";
                    this.system.registerHardware(name, type, capacity, memory);
                }
                break;
                case "RegisterExpressSoftware": {
                    String hardwareComponentName = params[0];
                    String name = params[1];
                    String type = "Express";
                    int capacity = Integer.parseInt(params[2]);
                    int memory = Integer.parseInt(params[3]);
                    system.registerSoftware(hardwareComponentName, name, type, capacity, memory);
                }
                break;
                case "RegisterLightSoftware": {
                    String hardwareComponentName = params[0];
                    String name = params[1];
                    String type = "Light";
                    int capacity = Integer.parseInt(params[2]);
                    int memory = Integer.parseInt(params[3]);
                    system.registerSoftware(hardwareComponentName, name, type, capacity, memory);
                }
                break;
                case "ReleaseSoftwareComponent":{
                    String hardwareComponentName = params[0];
                    String softwareComponentName = params[1];
                    system.releaseSoftwareComponentName(hardwareComponentName,softwareComponentName);
                }
                    break;
                case "Dump": {
                    String hardwareComponentName = params[0];
                    this.system.dump(hardwareComponentName);
                }
                break;
                case "Analyze":
                    result = this.system.analyze();
                    break;
                case "Destroy": {
                    String hardwareComponentName = params[0];
                    system.getDump().destroy(hardwareComponentName);
                }
                break;
                case "Restore": {
                    String hardwareComponentName = params[0];
                    try {
                        Hardware hardware = system.getDump().restore(hardwareComponentName);
                    } catch (IllegalArgumentException ex) {

                    }

                }
                break;
                case "DumpAnalyze":
                    result = this.system.getDump().dumpAnalyze();
                    break;

            }
        } else {
            result = this.system.systemSplit();
        }
        return result;
    }
}
