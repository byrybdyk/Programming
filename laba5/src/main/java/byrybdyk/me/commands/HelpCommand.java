package byrybdyk.me.commands;

import byrybdyk.me.aplication.CollectionManager;

import java.util.HashMap;

public class HelpCommand implements Command  {
    private HashMap<String, Command> commands;
    
    private CollectionManager collectionManipulator;

    public HelpCommand(HashMap<String, Command> commands, CollectionManager collectionManipulator) {
        this.commands = commands;
        this.collectionManipulator = collectionManipulator;
    }


    public String getDescription() {

        return ("help : вывести список всех доступных комманд");
    }
    public void execute() {
        for (Command c: commands.values()){
            System.out.println(c.getDescription());

        }
    }

}
