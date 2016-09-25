package p08.militaryelite;

/**
 * Created by ELISAV on 8.9.2016 г..
 */
public class MissionInst implements Mission {

    private String missionCode;
    private String missionState;

    public MissionInst(String missionCode, String missionState) {
        this.missionCode = missionCode;
        this.missionState = missionState;
    }

    private void setMissionState(String missionState) {

        if(this.isValidMission(missionState)){
            this.missionState = missionState;
        }

    }

    @Override
    public void completeMission() {

        this.missionState="Finished";
    }



    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();

        stringBuilder.append("Code Name: ").append(this.missionCode)
                .append("Freedom State: ").append(this.missionState)
                .append(System.lineSeparator());

        return stringBuilder.toString();
    }
}
