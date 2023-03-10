package byrybdyk.me.commands;

import byrybdyk.me.aplication.CollectionManager;

import java.util.HashMap;

public class InfoCommand implements Command  {

    private CollectionManager collectionManipulator;

    public InfoCommand(CollectionManager collectionManipulator) {
        this.collectionManipulator = collectionManipulator;
    }


    public String getDescription() {

        return ("info : вывести в стандартный поток вывода информацию о коллекции");
    }
    public void execute() {
        System.out.println("Что-то делает");
    }

}