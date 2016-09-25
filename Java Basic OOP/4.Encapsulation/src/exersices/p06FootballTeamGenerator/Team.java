package exersices.p06FootballTeamGenerator;

import java.util.LinkedList;

public class Team {

    private String name;
    private LinkedList<Player> players;
    private double averageStats;

    public Team(String name) {
        setName(name);
        players = new LinkedList<>();
        double averageStats = 0.0;
    }

    private void setName(String name) {
        if (name==null || name.equals(" ") || name.isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public void addPlayer(Player player) {

        players.add(player);

    }

    public void removePlayer(String playerName, String teamName) {

        int indexToRemove = -1;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName().equals(playerName)) {
                indexToRemove = i;
            }
        }
        if (indexToRemove == -1) {
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.", playerName, teamName));
        } else {
            players.remove(indexToRemove);
        }

    }

    public double getTeamAverageStats(String teamName) {

        if(players.size()==0){
            return 0;
        }
        for (Player player : this.players) {
            this.averageStats += player.getPlayerAverageStats();
        }
        this.averageStats /= this.players.size();

        return this.averageStats;
    }

}
