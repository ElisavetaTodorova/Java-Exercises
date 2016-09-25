package p08.militaryelite;


import java.util.LinkedList;
import java.util.List;

public class Commando extends SpecialisedSoldierInst {


    private List<Mission> missions;


    public Commando(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.missions=new LinkedList<>();
    }


    public void addMission(Mission mission){

        this.missions.add(mission);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();

        stringBuilder.append(super.toString())
                .append("Missions: ").append(System.lineSeparator());
        for (Mission mission : missions) {
            stringBuilder.append("  "+mission.toString());
        }

        return stringBuilder.toString();
    }
}
