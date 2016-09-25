package p08.militaryelite;

/**
 * Created by ELISAV on 8.9.2016 г..
 */
public interface Mission  {
    //code name and a state (inProgress or Finished).

    default boolean isValidMission(String missionName){
        if(missionName.equals("inProgress")||missionName.equals("Finished")){
            return true;
        }
        return false;
    }

    void completeMission();

}
