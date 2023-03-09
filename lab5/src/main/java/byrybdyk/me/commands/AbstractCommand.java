package byrybdyk.me.commands;
import byrybdyk.me.aplication.CollectionManager;
public abstract class AbstractCommand {

    protected CollectionManager collectionManipulator;

    public AbstractCommand() {}

    public AbstractCommand(CollectionManager collectionManipulator) {
        this.collectionManipulator = collectionManipulator;
    }

    public String execute() {
        return null;
    }

    public String execute(String arg) {
        return null;
    }

}
