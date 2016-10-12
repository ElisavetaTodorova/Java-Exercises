package system.split.models.hardware;

/**
 * Created by ELISAV on 11.10.2016 г..
 */
public class PowerHardware extends Hardware {

    public PowerHardware(String name, String type, int maximumCapacity, int maximumMemory) {
        super(name,type);
        this.setMaximumCapacity(maximumCapacity);
        this.setMaximumMemory(maximumMemory);
    }

    private void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = (int) (maximumCapacity - (maximumCapacity * 0.25));
    }

    private void setMaximumMemory(int maximumMemory) {
        this.maximumMemory = maximumMemory * 2;
    }

}
