package byrybdyk.me.commands;

import byrybdyk.me.aplication.CollectionManager;

import java.util.HashMap;
import java.util.Map;

public class HelpCommand implements Command {


    public String getDescription() {
        return null;
    }
    public void execute() {
        System.out.println("HELP");
    }
}
