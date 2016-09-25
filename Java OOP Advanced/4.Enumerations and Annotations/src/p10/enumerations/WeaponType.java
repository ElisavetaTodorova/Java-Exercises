package p10.enumerations;


public enum WeaponType {
    AXE(5, 10, 4),
    SWORD(4, 6, 3),
    KNIFE(3, 4, 2);

    private int minDamage;
    private int maxDamage;
    private int sockets;

    WeaponType(int minDamage, int maxDamage, int sockets) {
        this.setMinDamage(minDamage);
        this.setMaxDamage(maxDamage);
        this.setSockets(sockets);
    }

    public int getMinDamage() {
        return minDamage;
    }

    private void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    private void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getSockets() {
        return sockets;
    }

    private void setSockets(int sockets) {
        this.sockets = sockets;
    }
}
