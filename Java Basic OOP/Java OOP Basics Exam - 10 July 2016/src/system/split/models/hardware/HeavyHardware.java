package system.split.models.hardware;

/**
 * Created by ELISAV on 11.10.2016 г..
 */
public class HeavyHardware extends Hardware {

    public HeavyHardware(String name, String type, int maximumCapacity, int maximumMemory) {
        super(name, type);
        this.setMaximumCapacity(maximumCapacity);
        this.setMaximumMemory(maximumMemory);
    }

    private void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = (int) (maximumCapacity - (maximumCapacity * 0.75));
    }

    private void setMaximumMemory(int maximumMemory) {
        this.maximumMemory = (int) (maximumMemory - (maximumMemory * 0.75));
    }
}
