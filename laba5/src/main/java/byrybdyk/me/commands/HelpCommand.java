package byrybdyk.me.commands;

import java.util.HashMap;

public class HelpCommand implements Command  {
    private HashMap<String, Command> commands;

    public HelpCommand(HashMap<String, Command> commands) {
        this.commands = commands;
    }

    public String getDescription() {

        return ("Show available commands");
    }
    public void execute() {
        for (Command c: commands.values()){
            System.out.println(c.getDescription());

        }
    }

}
