package p05.borderControl;


public abstract class Inhabitant implements Livable {

    private String name;
    private String id;

    public Inhabitant(String name, String id) {
        this.setName(name);
        this.setId(id);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }


    @Override
    public boolean canInhabited(String id) {
        if(this.id.endsWith(id)){
            return false;
        }
        return true;
    }

    protected String getName() {
        return name;
    }
}
