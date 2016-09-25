package p05;

import java.util.List;


public class PersonComparatorInformation {

    private List<Person> peoples;
    private int comparedPersonIndex;
    private int matches = 0;
    private int totalPeopleCount;

    public PersonComparatorInformation(List<Person> peoples, int comparedPersonIndex) {
        this.setPeoples(peoples);
        this.setComparedPersonIndex(comparedPersonIndex);
    }

    private void setPeoples(List<Person> peoples) {
        this.peoples = peoples;
        this.totalPeopleCount = peoples.size();
    }

    private void setComparedPersonIndex(int comparedPersonIndex) {
        this.comparedPersonIndex = comparedPersonIndex;
    }

    public String getInformation() {
        Person comparedPerson = this.peoples.get(this.comparedPersonIndex);
        for (int i = 0; i < this.totalPeopleCount; i++) {
            if (peoples.get(i).compareTo(comparedPerson) == 0 && i != this.comparedPersonIndex) {
                this.matches++;
            }
        }
        if (this.matches == 0) {
            return "No matches";
        }else {
            this.matches++;
        }
        return String.format("%d %d %d", this.matches,
                this.totalPeopleCount - this.matches,
                this.totalPeopleCount);
    }


}
