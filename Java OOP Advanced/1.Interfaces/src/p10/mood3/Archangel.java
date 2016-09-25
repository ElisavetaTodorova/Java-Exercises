package p10.mood3;

public class Archangel extends GameObjectsImpl {


    private  int mana;
    public Archangel(String username, int level,int mana) {
        super(username, level);
        this.setMana(mana);
    }


    private void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String getHashedPassword() {
       String sb=new StringBuilder(this.getUserName()).reverse().toString();

        String result= sb +(this.getUserName().length()*21);
        return result;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> Archangel\n%d",this.getUserName(),this.getHashedPassword(),
                this.mana*this.getLevel());
    }
}
