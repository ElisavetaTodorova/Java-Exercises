package p07CompanyHierarchy;


public class Person {
    //id, first name and last name.
    private String id;
    private String firsName;
    private String secondName;

    public Person(String id, String firsName, String secondName) {
        setId(id);
        setFirsName(firsName);
        setSecondName(secondName);
    }

    private void setId(String id) {
        if(id.isEmpty()||id==null){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.id = id;
    }

    private void setFirsName(String firsName) {
        if(firsName.isEmpty()||firsName==null){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.firsName = firsName;
    }

    private void setSecondName(String secondName) {

        if(secondName.isEmpty()||secondName==null){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firsName='" + firsName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

}
