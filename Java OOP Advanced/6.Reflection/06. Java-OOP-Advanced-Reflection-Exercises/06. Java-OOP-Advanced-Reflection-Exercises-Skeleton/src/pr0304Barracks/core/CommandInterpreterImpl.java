package pr0304Barracks.core;

import pr0304Barracks.anotations.Inject;
import pr0304Barracks.contracts.CommandInterpreter;
import pr0304Barracks.contracts.Executable;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


public class CommandInterpreterImpl implements CommandInterpreter {

    private UnitFactory unitFactory;
    private Repository repository;

    public CommandInterpreterImpl(UnitFactory unitFactory, Repository repository) {
        this.unitFactory = unitFactory;
        this.repository = repository;
    }

    @Override
    public String interpretCommand(String[] data, String commandName) throws ReflectiveOperationException {
        String result;
        String COMMAND_PACKAGE = "pr0304Barracks.core.commands.";
        Class commandClass = Class.forName(COMMAND_PACKAGE + commandName);
        Constructor ctor = commandClass.getDeclaredConstructor(String[].class);
        ctor.setAccessible(true);
        Executable command = (Executable) ctor.newInstance((Object) data);
        this.inject(command, commandClass);
        return command.execute();
    }

    private void inject(Executable command, Class commandClass) throws IllegalAccessException {
        Field[] executableClassFields = commandClass.getDeclaredFields();
        Field[] theseFields = CommandInterpreterImpl.class.getDeclaredFields();
        for (Field executableClassField : executableClassFields) {
            if (!executableClassField.isAnnotationPresent(Inject.class)) {
                continue;
            }
            executableClassField.setAccessible(true);
            for (Field theseField : theseFields) {
                if (!theseField.getType().equals(executableClassField.getType())) {
                    continue;
                }
                theseField.setAccessible(true);
                executableClassField.set(command, theseField.get(this));
            }
        }
    }
}
