package pr0304Barracks.core.commands;

import pr0304Barracks.anotations.Inject;
import pr0304Barracks.contracts.Repository;


public class retire extends Command {
    @Inject
    private Repository repository;

    public retire(String[] data) {
        super(data);
    }

    @Override
    public String execute() throws ReflectiveOperationException {
        String unitType = this.getData()[1];
        try {
            this.repository.removeUnit(unitType);
            return unitType + " retired!";
        } catch (RuntimeException ex) {
            return ex.getMessage();
        }
    }
}
