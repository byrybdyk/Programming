package byrybdyk.me.commands;

import byrybdyk.me.aplication.CollectionManager;

import java.util.HashMap;

public class InsertNullCommand implements Command  {

    private CollectionManager collectionManipulator;

    public InsertNullCommand(CollectionManager collectionManipulator) {
        this.collectionManipulator = collectionManipulator;
    }


    public String getDescription(){

        return ("insert null {element} : добавить новый элемент с заданным ключом");
    }
    public void execute() {
        System.out.println("Что-то делает");
    }

}