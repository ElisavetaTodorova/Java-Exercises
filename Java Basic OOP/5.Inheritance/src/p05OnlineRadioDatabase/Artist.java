package p05OnlineRadioDatabase;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Artist {

    private String name;
    private String songName;
    private double minutes;
    private double seconds;
    private double totalSongLength;

    public Artist(String name, String songName, double minutes, double seconds) {
        setName(name);
        setSongName(songName);
        setMinutes(minutes);
        setSeconds(seconds);
        setTotalSongLength(minutes,seconds);
    }


    private void setName(String name) {
        if (name.length() < 3 || name.length() > 20) {
            throw new InvalidArtistNameException("Artist name should be between 3 and 20 symbols.");
        }
        this.name = name;
    }

    private void setSongName(String songName) {
        if (songName.length() < 3 || songName.length() > 20) {
            throw new InvalidSongException("Invalid song.");
        }
        this.songName = songName;


    }


    private void setMinutes(double minutes) {
        if (minutes < 0 || minutes > 14) {
            throw new InvalidSongMinutesException("Song minutes should be between 0 and 14.");
        }
        this.minutes = minutes;
    }

    private void setSeconds(double seconds) {
        if (seconds < 0 || seconds > 59) {
            throw new InvalidSongSecondsException("Song seconds should be between 0 and 59.");
        }
        this.seconds = seconds;
    }

    private void setTotalSongLength(double minutes, double seconds) {
        if (minutes > 14 || seconds > 59) {
            throw new InvalidSongLengthException("Invalid song length.");
        }
        this.totalSongLength = 0;
    }
}
