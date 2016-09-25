package p08.militaryelite;


public  class Private extends Soldier {

    private double salary;

    public Private(String id, String firstName, String lastName, double salary) {

        super(id, firstName, lastName);
        this.setSalary(salary);
    }


    private void setSalary(double salary) {
        if (salary >= 0) {

            this.salary = salary;
        }
    }

    //Name: <firstName> <lastName> Id: <id> Salary: <salary>
    @Override
    public String toString() {

        return super.toString()
                + " Salary: " +
                String.format("%.2f", this.salary)
                + System.lineSeparator();
    }
}
