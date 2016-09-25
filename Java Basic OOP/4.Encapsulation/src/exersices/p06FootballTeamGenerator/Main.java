package exersices.p06FootballTeamGenerator;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            HashMap<String, Team> teams = new HashMap<>();
            String input = reader.readLine();

            while (!input.equals("END")) {
                String[] params = input.split(";");
                String operationType = params[0];
                try {
                    switch (operationType) {

                        case "Team":
                            String teamName = params[1];
                            Team team = new Team(teamName);
                            teams.put(teamName, team);

                            break;
                        case "Add":

                            String teamNameToAdd = params[1];
                            String playerNameToAdd = params[2];
                            double endurance = Double.parseDouble(params[3]);
                            double sprint = Double.parseDouble(params[4]);
                            double dribble = Double.parseDouble(params[5]);
                            double passing = Double.parseDouble(params[6]);
                            double shooting = Double.parseDouble(params[7]);
                            Player playerToAdd = new Player(playerNameToAdd, endurance, sprint, dribble, passing,
                                    shooting);
                            if(teams.containsKey(teamNameToAdd)) {
                                teams.get(teamNameToAdd).addPlayer(playerToAdd);
                            }else {
                                throw new IllegalArgumentException(String.format("Team %s does not exist.", teamNameToAdd));
                            }

                            break;
                        case "Remove":

                            String teamNameToRemove = params[1];
                            String playerNameToRemove = params[2];
                            if (teams.containsKey(teamNameToRemove)) {
                                teams.get(teamNameToRemove).removePlayer(playerNameToRemove, teamNameToRemove);
                            }else {
                                throw new IllegalArgumentException(String.format("Team %s does not exist.", teamNameToRemove));
                            }


                            break;
                        case "Rating":

                            String teamNameToRate = params[1];
                            double teamAverageStats =0;
                            if(teams.containsKey(teamNameToRate)){
                                 teamAverageStats = teams.get(teamNameToRate).getTeamAverageStats(teamNameToRate);

                                System.out.printf("%s - %.0f%n", teamNameToRate, teamAverageStats);
                            }else {
                                throw new IllegalArgumentException(String.format("Team %s does not exist.", teamNameToRate));
                            }

                            break;

                    }
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }

                input = reader.readLine();
            }

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
