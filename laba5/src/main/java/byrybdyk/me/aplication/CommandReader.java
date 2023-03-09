package byrybdyk.me.aplication;

import byrybdyk.me.commands.Command;
import byrybdyk.me.commands.HelpCommand;

import java.util.HashMap;
import java.util.Scanner;

public class CommandReader {
    private CollectionManager collectionManipulator;

    private HashMap<String, Command> commands;

    public CommandReader(CollectionManager collectionManager) {
        this.collectionManipulator = collectionManager;
    }

    {
        commands = new HashMap<>();
        commands.put("help", new HelpCommand(commands));
    }

    public HashMap<String, Command> get_commands(){
        return commands;
    }
    public void start() {
        String[] finalUserCommand;
        // FieldReceiver receiver = new FieldReceiver(collectionManipulator);
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Enter a command: ");
            String user_command = scanner.nextLine();
            Command command = commands.get(user_command);
            if (commands.containsKey(user_command)){
                command.execute();

            }
            else {
                System.out.println("Unknown command");
            }


        }


    }

}