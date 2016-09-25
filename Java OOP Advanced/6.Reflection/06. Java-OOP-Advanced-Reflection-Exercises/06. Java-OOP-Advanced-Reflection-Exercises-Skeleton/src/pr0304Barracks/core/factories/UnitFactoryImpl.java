package pr0304Barracks.core.factories;

import pr0304Barracks.contracts.Unit;
import pr0304Barracks.contracts.UnitFactory;
import pr0304Barracks.models.units.AbstractUnit;

import java.lang.reflect.Constructor;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "pr0304Barracks.models.units.";

    @Override
    public Unit createUnit(String unitType) {
        try {
            Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
            Constructor ctor = (Constructor) unitClass.getConstructor();
            AbstractUnit unit = (AbstractUnit) ctor.newInstance();
            return unit;
        }catch ( ReflectiveOperationException ex){
            throw new RuntimeException("Invalid unit!");
        }

        // TODO: implement for problem 3

    }
}
