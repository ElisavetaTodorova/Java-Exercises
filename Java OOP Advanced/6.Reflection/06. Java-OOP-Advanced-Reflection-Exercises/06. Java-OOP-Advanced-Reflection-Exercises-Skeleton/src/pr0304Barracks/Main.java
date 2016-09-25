package pr0304Barracks;

import pr0304Barracks.contracts.CommandInterpreter;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.Runnable;
import pr0304Barracks.contracts.UnitFactory;
import pr0304Barracks.core.CommandInterpreterImpl;
import pr0304Barracks.core.Engine;
import pr0304Barracks.core.factories.UnitFactoryImpl;
import pr0304Barracks.data.UnitRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, ReflectiveOperationException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		CommandInterpreter commandInterpreter=new CommandInterpreterImpl(unitFactory,repository);
		Runnable engine = new Engine(commandInterpreter);
		engine.run();

	}
}
