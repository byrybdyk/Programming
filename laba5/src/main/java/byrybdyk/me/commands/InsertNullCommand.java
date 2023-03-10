package byrybdyk.me.commands;

import byrybdyk.me.aplication.CollectionManager;

import java.util.HashMap;

public class InsertNullCommand implements Command  {

    private CollectionManager collectionManipulator;
    private String user_command;

    public InsertNullCommand(CollectionManager collectionManipulator,String user_command) {
        this.collectionManipulator = collectionManipulator;
        this.user_command = user_command;
    }


    long id;

    public String getDescription(){

        return ("insert null {element} : добавить новый элемент с заданным ключом");
    }
    public void execute() {
        System.out.println("Что-то делает");
    }

}