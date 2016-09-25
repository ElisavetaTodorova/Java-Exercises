package pr0304Barracks.contracts;

public interface CommandInterpreter {

	String interpretCommand(String[] data, String commandName) throws ReflectiveOperationException;
}
