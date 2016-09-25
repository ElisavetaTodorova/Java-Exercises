package p03.ferrari;

import p03.ferrari.interfaces.Car;

/**
 * Created by ELISAV on 7.9.2016 г..
 */
public class Ferrari implements Car {

    private  static final String MODEL="488-Spider";

    private String driversName;

    public Ferrari(String driversName) {
        setDriversName(driversName);
    }

    private void setDriversName(String driversName) {
        this.driversName = driversName;
    }

    public String getDriversName() {
        return driversName;
    }

    @Override
    public String breaks() {
        return "Brakes!";
    }

    @Override
    public String gasPedal() {
        return "Zadu6avam sA!";
    }

    @Override
    public String getMODEL() {
        return MODEL;

    }
//488-Spider/Brakes!/Zadu6avam sA!/Bat Giorgi
    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(this.getMODEL())
                .append("/").append(this.breaks())
                .append("/").append(this.gasPedal())
                .append("/").append(this.getDriversName());
        return stringBuilder.toString();
    }
}
