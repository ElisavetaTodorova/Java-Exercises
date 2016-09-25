package p05OnlineRadioDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int totalMinutes = 0;
        int totalSeconds = 0;
        int totalSongs = 0;
        for (int i = 0; i < n; i++) {
            try {
                String[] input = reader.readLine().split(";");
                String name = input[0];
                String songName = input[1];
                String[] songLength = input[2].split(":");
                double minutes = Double.parseDouble(songLength[0]);
                double seconds = Double.parseDouble(songLength[1]);
                Artist artist = new Artist(name, songName, minutes, seconds);
                System.out.println("Song added.");
                totalMinutes += minutes;
                totalSeconds += seconds;
                totalSongs++;

            } catch (InvalidSongException ex) {
                System.out.println(ex.getMessage());
            }
        }
        String result = calculateTotalLength(totalMinutes, totalSeconds);
        System.out.printf("Songs added: %d%n", totalSongs);
        System.out.printf("Playlist length: %s%n",result);


    }

    private static String calculateTotalLength(double totalMinutes, double totalSeconds) {
        StringBuilder result = new StringBuilder();

        double secods=totalSeconds%60;
        double minutes=(totalMinutes+totalSeconds/60)%60;
        double hours=(totalMinutes+totalSeconds/60)/60;
        //1h 0m 1s
        result.append((int)hours+"h ").append((int)minutes+"m ").append((int)secods+"s ");
        return result.toString();
    }

}
