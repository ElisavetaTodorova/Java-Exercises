package system.split.models.hardware;

import system.split.models.Component;

/**
 * Created by ELISAV on 11.10.2016 г..
 */
public abstract class Hardware extends Component {
    protected int maximumCapacity;
    protected int maximumMemory;

    protected Hardware(String name, String type) {
        super(name, type);
    }
}
