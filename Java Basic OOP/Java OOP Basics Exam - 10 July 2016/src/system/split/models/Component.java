package system.split.models;

/**
 * Created by ELISAV on 11.10.2016 г..
 */
public abstract class Component {
    protected String name;
    protected String type;

    protected Component(String name, String type) {
        this.setName(name);
        this.setType(type);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setType(String type) {
        this.type = type;
    }
}
