package p10.interfaces;

import p10.enumerations.Gems;

/**
 * Created by ELISAV on 11.9.2016 г..
 */
public interface Weapon {

    void addGem(Gems gem, int index);
    void removeGem(int index);


}
