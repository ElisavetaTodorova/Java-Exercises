package definingClassesHomework.p09Google;

import java.util.LinkedList;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class Person {
//    •	“<Name> company <companyName> <department> <salary>”
//            •	“<Name> pokemon <pokemonName> <pokemonType>”
//            •	“<Name> parents <parentName> <parentBirthday>”
//            •	“<Name> children <childName> <childBirthday>”
//            •	“<Name> car <carModel> <carSpeed>”
    private String name;
    private LinkedList<Pokemon>pokemons;
    private LinkedList<Relatives>parents;
    private LinkedList<Relatives>childrens;
    private Car car;
    private Company company;

    public Person(String name) {
        this.name = name;
        this.childrens=new LinkedList<>();
        this.parents=new LinkedList<>();
        this.pokemons=new LinkedList<>();


    }

    public LinkedList<Pokemon> getPokemons() {
        return pokemons;
    }

    public LinkedList<Relatives> getParents() {
        return parents;
    }

    public LinkedList<Relatives> getChildrens() {
        return childrens;
    }

    public void setCar(Car car) {

        this.car = car;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {

        return car;
    }

    public Company getCompany() {
        return company;
    }
}
