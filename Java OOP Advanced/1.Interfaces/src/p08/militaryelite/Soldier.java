package p08.militaryelite;


public abstract class Soldier {


    private String id;
    private String firstName;
    private String lastName;

    public Soldier(String id, String firstName, String lastName) {

        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    private void setId(String id) {
        if (!id.isEmpty() && !(id == null)) {

            this.id = id;
        }
    }

    private void setFirstName(String firstName) {

        if (!firstName.isEmpty() && !(firstName == null)) {

            this.firstName = firstName;
        }

    }

    private void setLastName(String lastName) {

        if (!lastName.isEmpty() && !(lastName == null)) {

            this.lastName = lastName;
        }

    }

    public String getId() {
        return id;
    }

    //Name: <firstName> <lastName> Id: <id> Salary: <salary>
    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Name: ")
                .append(this.firstName)
                .append(" " + this.lastName)
                .append(" Id: " + this.id);

        return stringBuilder.toString();
    }
}
