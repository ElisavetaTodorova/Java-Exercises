package p08.militaryelite;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ELISAV on 8.9.2016 г..
 */
public class LeutenantGeneral extends Private {


    private List<Private> soldiers;

    public LeutenantGeneral(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        soldiers=new LinkedList<>();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(super.toString())
                .append("Private:").append(System.lineSeparator());

        for (Private soldier : soldiers) {
            stringBuilder.append("  "+soldier.toString());
        }
        return stringBuilder.toString();
    }
}
