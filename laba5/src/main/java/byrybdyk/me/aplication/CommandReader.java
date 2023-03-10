package byrybdyk.me.aplication;

import byrybdyk.me.commands.*;

import java.util.HashMap;
import java.util.Scanner;

public class CommandReader {
    private CollectionManager collectionManipulator;

    private HashMap<String, Command> commands;
    private HashMap<String, String> double_word_command;

    String user_command;
    String[] finalUserCommand;

    public CommandReader(CollectionManager collectionManager) {
        this.collectionManipulator = collectionManager;
    }

    {
        commands = new HashMap<>();
        commands.put("help", new HelpCommand(commands,collectionManipulator));
        commands.put("info", new InfoCommand(collectionManipulator));
        commands.put("show", new ShowCommand(collectionManipulator));
        commands.put("insert null", new InsertNullCommand(collectionManipulator,user_command));

        double_word_command = new HashMap<>();
        double_word_command.put("insert", "null");

    }

    public void start() {
        Scanner scanner = new Scanner(System.in);




        while (true) {
            System.out.print("Enter a command: ");
            user_command = scanner.nextLine();
            finalUserCommand = user_command.trim().toLowerCase().split(" ", 3);
            Command command = commands.get(user_command);
            if ((double_word_command.containsKey(finalUserCommand[0])) && (finalUserCommand.length >= 2 )) {
                if (double_word_command.containsKey(finalUserCommand[0]) && (double_word_command.get(finalUserCommand[0]).toString().equals(finalUserCommand[1].toString()))) {
                    user_command = finalUserCommand[0] + " " + finalUserCommand[1];
                    command = commands.get(user_command);
                    command.execute();
                    continue;
                }
                else {
                    System.out.println("Unknown command");
                    continue;
                }

            }

            if (commands.containsKey(finalUserCommand[0]) ) {
                command = commands.get(finalUserCommand[0]);
                command.execute();

            } else {
                System.out.println("Unknown command");
            }


        }
    }
}