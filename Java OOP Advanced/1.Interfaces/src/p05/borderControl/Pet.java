package p05.borderControl;

/**
 * Created by ELISAV on 7.9.2016 г..
 */
public class Pet implements Birth {
    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        setName(name);
        setBirthData(birthDate);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setBirthData(String birthData) {
        this.birthDate = birthData;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public boolean hasSameYearOfBirth(String date) {
        if(this.birthDate.endsWith(date)){
            return  true;
        }
        return false;
    }
}
