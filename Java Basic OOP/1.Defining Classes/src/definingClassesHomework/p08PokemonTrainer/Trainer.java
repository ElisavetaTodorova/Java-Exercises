package definingClassesHomework.p08PokemonTrainer;


import java.util.LinkedList;

public class Trainer implements Comparable<Trainer> {
    //Trainers have a name, number of badges and a collection of pokemon
    private String name;
    private Integer numberOfBadges;
    private LinkedList<Pokemon> pokemons;

    public Trainer(String name, LinkedList<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
        this.numberOfBadges = 0;
    }

    public Integer getNumberOfBadges() {
        return numberOfBadges;
    }

    public void setNumberOfBadges(Integer numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public LinkedList<Pokemon> getPokemons() {
        return pokemons;
    }


    public void setPokemons(LinkedList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public int compareTo(Trainer trainer) {
        return Integer.compare(trainer.numberOfBadges, this.numberOfBadges);
    }

    //TrainerName> <Badges> <NumberOfPokemon>”.
    @Override
    public String toString() {
        return String.format("%s %d %d", this.name, this.numberOfBadges, this.pokemons.size());
    }
}
