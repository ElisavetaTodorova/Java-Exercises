package pr0304Barracks.core.commands;

import pr0304Barracks.anotations.Inject;
import pr0304Barracks.contracts.Repository;


public class report extends Command {
    @Inject
    private Repository repository;

    public report(String[] data) {
        super(data);

    }

    @Override
    public String execute() throws ReflectiveOperationException {
        String output = this.repository.getStatistics();
        return output;
    }
}
