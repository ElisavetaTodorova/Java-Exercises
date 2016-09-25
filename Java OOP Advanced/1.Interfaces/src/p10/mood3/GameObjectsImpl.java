package p10.mood3;

/**
 * Created by ELISAV on 8.9.2016 г..
 */
public abstract class GameObjectsImpl implements GameObject {


    //    •	username
//•	hashedPassword
//•	level
//•	special points.

    private String username;
    private String hashedPassword;
    private int level;

    public GameObjectsImpl(String username, int level) {

        this.setUsername(username);
        this.setLevel(level);
        this.hashedPassword=getHashedPassword();


    }

    private void setUsername(String username) {
        this.username = username;
    }



    private void setLevel(int level) {
        this.level = level;
    }


    @Override
    public String getUserName() {
        return this.username;
    }



    @Override
    public int getLevel() {
        return this.level;
    }


}
