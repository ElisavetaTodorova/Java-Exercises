package p08.militaryelite;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ELISAV on 8.9.2016 г..
 */
public class Engineer extends SpecialisedSoldierInst {


    private List<Repair> repairs;

    public Engineer(String id, String firstName, String lastName, double salary) {

        super(id, firstName, lastName, salary);
        this.repairs=new LinkedList<>();
    }

    public void addRepair(Repair repair){

        this.repairs.add(repair);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();

        stringBuilder.append(super.toString())
            .append("Repairs:").append(System.lineSeparator());
        for (Repair repair : repairs) {
            stringBuilder.append("  "+repair.toString());
        }

        return stringBuilder.toString();
    }
}
