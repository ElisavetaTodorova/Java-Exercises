package p03Mankind;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Worker extends Human {

    private double weekSalary;
    private double hoursPerDay;

    public Worker(String firstName,
                  String secondName,
                  double weekSalary,
                  double hoursPerDay) {
        super(firstName, secondName);
        setWeekSalary(weekSalary);
        setHoursPerDay(hoursPerDay);
    }

    private void setWeekSalary(double weekSalary) {
        if (weekSalary <= 10) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    private void setHoursPerDay(double hoursPerDay) {
        if (hoursPerDay <= 1 || hoursPerDay > 12) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.hoursPerDay = hoursPerDay;
    }

    @Override
    protected void setSecondName(String secondName) {
        if (secondName.length() < 4) {
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.setSecondName(secondName);
    }

//    First Name: Ivcho
//    Last Name: Ivancov
//    Week Salary: 1590.00
//    Hours per day: 10.00
//    Salary per hour: 22.71

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        double salaryPerHour = weekSalary / (hoursPerDay * 7);
        stringBuilder.append("First Name: ").append(this.getFirstName())
                .append(System.lineSeparator())
                .append("Last Name: ").append(this.getSecondName())
                .append(System.lineSeparator())
                .append("Week Salary: ").append(String.format("%.2f", this.weekSalary))
                .append(System.lineSeparator())
                .append("Hours per day: ").append(String.format("%.2f", this.hoursPerDay))
                .append(System.lineSeparator())
                .append("Salary per hour: ").append(String.format("%.2f", salaryPerHour))
                .append(System.lineSeparator());

        return stringBuilder.toString();
    }
}
