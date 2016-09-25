package definingClassesHomework.p08PokemonTrainer;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class PokemonTrainer {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, Trainer> trainers = new LinkedHashMap<>();
        String input = reader.readLine();
        if (input.equals(null) || input.equals("")) {
            return;
        }
        while (!input.equals("Tournament")) {
            //“<TrainerName> <PokemonName> <PokemonElement> <PokemonHealth>”
            String[] params = input.split("\\s+");
            String trainerName = params[0];
            String pokemonName = params[1];
            String pokemonElemnt = params[2];
            Integer pokemoHealth = Integer.valueOf(params[3]);
            if (!trainers.containsKey(trainerName)) {
                trainers.put(trainerName, new Trainer(trainerName, new LinkedList<Pokemon>()));
            }
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElemnt, pokemoHealth);
            trainers.get(trainerName).getPokemons().add(pokemon);
            input = reader.readLine();
        }
        input = reader.readLine();
        if (input.equals(null) || input.equals("")) {
            return;
        }
        while (!input.equals("End")) {

            String type = input;
            //“Fire”, “Water”, “Electricity

            for (Trainer trainer : trainers.values()) {
                int badgesCount = 0;
                for (Pokemon pokemon : trainer.getPokemons()) {

                    if (pokemon.getElement().equals(type)) {
                        badgesCount++;
                    }
                }
                if (badgesCount > 0) {
                    trainer.setNumberOfBadges(trainer.getNumberOfBadges() + 1);
                } else {
                    for (Pokemon pokemon : trainer.getPokemons()) {

                        pokemon.setHealth(pokemon.getHealth() - 10);
                        if (pokemon.getHealth() <= 0) {
                            trainer.getPokemons().remove(pokemon);
                        }
                    }
                }

            }
            input = reader.readLine();
        }
        trainers.values().stream()
                .sorted((t1, t2) -> Integer.compare(t2.getNumberOfBadges(), t1.getNumberOfBadges()))
                .forEach(System.out::println);


    }
}
