package system.split.models.software;

import system.split.models.Component;

/**
 * Created by ELISAV on 11.10.2016 г..
 */
public abstract class Software extends Component {

    int capacityConsumption;
    int memoryConsumption;

    Software(String name,String type) {
        super(name, type);
    }

    public int getCapacityConsumption() {
        return capacityConsumption;
    }

    public int getMemoryConsumption() {
        return memoryConsumption;
    }
}
