package pr0304Barracks.core;

import pr0304Barracks.contracts.CommandInterpreter;
import pr0304Barracks.contracts.Runnable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Engine implements Runnable {
    private CommandInterpreter commandInterpreter;


    public Engine(CommandInterpreter commandInterpreter) {
        this.commandInterpreter=commandInterpreter;
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        while (true) {
            try {
                String input = reader.readLine();
                String[] data = input.split("\\s+");
                String commandName = data[0];
                if (commandName.equals("fight")) {
                    break;
                }

                String result = commandInterpreter.interpretCommand(data, commandName);
                System.out.println(result);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ReflectiveOperationException e) {
                e.printStackTrace();
            }
        }
    }

    // TODO: refactor for problem 4
//    private String interpredCommand(String[] data, String commandName) throws ReflectiveOperationException {
//        String result;
//        String COMMAND_PACKAGE = "pr0304Barracks.core.commands.";
//        Class commandClass = Class.forName(COMMAND_PACKAGE + commandName);
//        Constructor ctor = commandClass.getDeclaredConstructor(String[].class, Repository.class, UnitFactory.class);
//        ctor.setAccessible(true);
//        Command command = (Command) ctor.newInstance(data,this.repository,this.unitFactory);
//        return command.execute();
////        switch (commandName) {
////            case "add":
////                result = this.addUnitCommand(data);
////                break;
////            case "report":
////                result = this.reportCommand(data);
////                break;
////            case "fight":
////                result = this.fightCommand(data);
////                break;
////            default:
////                throw new RuntimeException("Invalid command!");
////        }
////        return result;
//    }
//
//    private String reportCommand(String[] data) {
//        String output = this.repository.getStatistics();
//        return output;
//    }
//
//    private String addUnitCommand(String[] data) throws ReflectiveOperationException {
//        String unitType = data[1];
//        Unit unitToAdd = this.unitFactory.createUnit(unitType);
//        this.repository.addUnit(unitToAdd);
//        String output = unitType + " added!";
//        return output;
//    }
//
//    private String fightCommand(String[] data) {
//        return "fight";
//    }
}
