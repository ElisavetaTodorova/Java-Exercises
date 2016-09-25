package p07CompanyHierarchy;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Department {

    private String name;

    public Department(String name) {
        setName(name);
    }

    //Production, Accounting, Sales or Marketing.
    private void setName(String name) {
        if (name.equals("Production") || name.equals("Accounting")
                || name.equals("Sales") || name.equals("Marketing")) {
            this.name = name;
        }else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}
