package system.split.models.software;

import system.split.models.Component;

/**
 * Created by ELISAV on 11.10.2016 г..
 */
public abstract class Software extends Component {

    protected int capacityConsumption;
    protected int memoryConsumption;

    protected Software(String name, String type) {
        super(name, type);
    }

}
