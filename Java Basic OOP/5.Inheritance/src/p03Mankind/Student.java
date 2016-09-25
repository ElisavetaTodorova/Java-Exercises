package p03Mankind;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Student extends Human {

    private String facultyNumber;

    public Student(String firstName, String secondName, String facultyNumber) {
        super(firstName, secondName);
        setFacultyNumber(facultyNumber);
    }

    private void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() < 5 || facultyNumber.length() > 10) {
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        char[] chars = facultyNumber.toCharArray();
        for (char aChar : chars) {
            if (!Character.isLetterOrDigit(aChar)) {
                throw new IllegalArgumentException("Invalid faculty number!");
            }
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("First Name: ").append(this.getFirstName())
                .append(System.lineSeparator())
                .append("Last Name: ").append(this.getSecondName())
                .append(System.lineSeparator())
                .append("Faculty number: ").append(this.facultyNumber)
                .append(System.lineSeparator());
        return stringBuilder.toString();
    }
}
