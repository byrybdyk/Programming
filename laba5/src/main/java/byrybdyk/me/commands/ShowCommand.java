package byrybdyk.me.commands;

import byrybdyk.me.aplication.CollectionManager;

import java.util.HashMap;

public class ShowCommand implements Command  {

    private CollectionManager collectionManipulator;

    public ShowCommand(CollectionManager collectionManipulator) {
        this.collectionManipulator = collectionManipulator;
    }


    public String getDescription(){

        return ("show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
    }
    public void execute() {
        System.out.println("Что-то делает");
    }

}
