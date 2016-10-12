package system.split.models;

/**
 * Created by ELISAV on 11.10.2016 г..
 */
public abstract class Component {
    private String name;
    private String type;

    protected Component(String name, String type) {
        this.setName(name);
        this.setType(type);
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return type;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setType(String type) {
        this.type = type;
    }
}
