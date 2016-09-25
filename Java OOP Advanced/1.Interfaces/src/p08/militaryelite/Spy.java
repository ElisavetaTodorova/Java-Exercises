package p08.militaryelite;

/**
 * Created by ELISAV on 8.9.2016 г..
 */
public class Spy extends Soldier {

    private String codeNumber;

    public Spy(String id, String firstName, String lastName,String codeNumber) {

        super(id, firstName, lastName);
        this.setCodeNumber(codeNumber);
    }


    private void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();

        stringBuilder.append(super.toString())
                .append(System.lineSeparator())
                .append("Code Number: ")
                .append(this.codeNumber)
                .append(System.lineSeparator());

        return stringBuilder.toString();
    }
}
