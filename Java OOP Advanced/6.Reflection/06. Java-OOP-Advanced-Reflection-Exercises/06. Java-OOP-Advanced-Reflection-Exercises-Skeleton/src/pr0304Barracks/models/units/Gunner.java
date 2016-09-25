package pr0304Barracks.models.units;

/**
 * Created by ELISAV on 17.9.2016 г..
 */
public class Gunner extends AbstractUnit {

    private static final int GUNNER_HEALHT = 20;
    private static final int GUNNER_ATTACK = 20;

    public Gunner() {
        super(GUNNER_HEALHT, GUNNER_ATTACK);
    }
}
