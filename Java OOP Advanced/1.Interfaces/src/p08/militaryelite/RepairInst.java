package p08.militaryelite;

/**
 * Created by ELISAV on 8.9.2016 г..
 */
public class RepairInst implements Repair {

    private String name;
    private int hoursWorked;

    public RepairInst(String name, int hoursWorked) {

        this.setName(name);
        this.setHoursWorked(hoursWorked);
    }


    private void setName(String name) {
        this.name = name;
    }

    private void setHoursWorked(int hoursWorked) {

        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        }
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHours() {

        return this.hoursWorked;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Part Name: ").append(this.name)
                .append("Boat Hours Worked: ").append(this.hoursWorked)
                .append(System.lineSeparator());

        return stringBuilder.toString();
    }
}
