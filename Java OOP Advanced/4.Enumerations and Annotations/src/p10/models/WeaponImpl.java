package p10.models;

import p10.enumerations.Gems;
import p10.enumerations.WeaponType;
import p10.interfaces.Weapon;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ELISAV on 11.9.2016 г..
 */
public class WeaponImpl implements Weapon {

    private String weaponName;
    private WeaponType weaponType;
    private List<Gems> gems;
    private int minDamage;
    private int maxDamage;
    private int strength;
    private int agility;
    private int vitality;

    public WeaponImpl(String weaponName, WeaponType weaponType) {
        this.setWeaponName(weaponName);
        this.setWeaponType(weaponType);
        this.setMinDamage(weaponType.getMinDamage());
        this.setMaxDamage(weaponType.getMaxDamage());
        this.setStrength(0);
        this.setAgility(0);
        this.setVitality(0);
        this.gems = new LinkedList<>();
    }

    public String getWeaponName() {
        return weaponName;
    }

    private void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    private void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getMinDamage() {
        return minDamage;
    }

    private void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    private int getMaxDamage() {
        return maxDamage;
    }

    private void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    private int getStrength() {
        return strength;
    }

    private void setStrength(int strength) {
        this.strength = strength;
    }

    private int getAgility() {
        return agility;
    }

    private void setAgility(int agility) {
        this.agility = agility;
    }

    private int getVitality() {
        return vitality;
    }

    private void setVitality(int vitality) {
        this.vitality = vitality;
    }

    @Override
    public void addGem(Gems gem, int index) {
        if (index >= 0 && index <= this.getWeaponType().getSockets()) {
            if (!gems.contains(gem)) {
                this.gems.add(index, gem);
                this.setMinDamage(this.getMinDamage() + gem.getStrength() * 2
                        + gem.getAgility());
                this.setMaxDamage(this.getMaxDamage() + gem.getStrength() * 3
                        + gem.getAgility() * 4);
                this.setAgility(this.getAgility() + gem.getAgility());
                this.setVitality(this.getVitality() + gem.getVitality());
                this.setStrength(this.getStrength() + gem.getStrength());
            }
        }
    }

    @Override
    public void removeGem(int index) {
        if (index >= 0 && index <= this.getWeaponType().getSockets() && !(this.gems.isEmpty())) {
            if (this.gems.size() > index) {
                Gems gem = this.gems.remove(index);
                this.setMinDamage(this.getMinDamage() - gem.getStrength() * 2
                        - gem.getAgility());
                this.setMaxDamage(this.getMaxDamage() - gem.getStrength() * 3
                        - gem.getAgility() * 4);
                this.setAgility(this.getAgility() - gem.getAgility());
                this.setVitality(this.getVitality() - gem.getVitality());
                this.setStrength(this.getStrength() - gem.getStrength());
            }
        }

    }

    @Override
    public String toString() {
        return String.format("%s: %d-%d Damage, +%d Strength, +%d Agility, +%d Vitality", this.getWeaponName(),
                this.getMinDamage(), this.getMaxDamage(), this.getStrength(), this.getAgility(),
                this.getVitality());

    }
}
