package p02.interfaces;

/**
 * Created by ELISAV on 12.9.2016 г..
 */
public interface Kingdom {

    void attack();

    void addFootman(String...names);

    void addGuard(String...names);

    void setKing(String kingName);

    void kill(String name);

}
