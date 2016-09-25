package definingClassesHomework.p08PokemonTrainer;


public class Pokemon {
    //, Pokemon have a name, an element and health
    private String name;
    private String element;
    private Integer health;

    public Pokemon(String name, String element, Integer health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getElement() {
        return element;
    }

    public Integer getHealth() {

        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
}
