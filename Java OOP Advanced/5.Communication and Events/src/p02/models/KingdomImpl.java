package p02.models;

import p02.interfaces.Attackable;
import p02.interfaces.Kingdom;

import java.util.LinkedHashMap;

/**
 * Created by ELISAV on 12.9.2016 г..
 */
public class KingdomImpl implements Kingdom {

    private Person king;
    private LinkedHashMap<String, Person> footmans;
    private LinkedHashMap<String, Person> royalGuards;

    public KingdomImpl() {
        this.footmans = new LinkedHashMap<>();
        this.royalGuards = new LinkedHashMap<>();

    }

    @Override
    public void attack() {
        king.handleAttack();
        royalGuards.values().forEach(Attackable::handleAttack);
        footmans.values().forEach(Attackable::handleAttack);
    }

    @Override
    public void addFootman(String...names) {
        for (String name : names) {
            Person footMan=new Footman(name);
            this.footmans.put(name,footMan);
        }

    }

    @Override
    public void addGuard(String...names) {
        for (String name : names) {
            Person guard=new RoyalGuard(name);
            this.royalGuards.put(name,guard);
        }

    }

    @Override
    public void setKing(String kingName) {
        this.king = new King(kingName);
    }

    @Override
    public void kill(String name) {
        if(this.footmans.containsKey(name)){
            this.footmans.remove(name);
        }else  if(this.royalGuards.containsKey(name)){
            this.royalGuards.remove(name);
        }
    }
}
