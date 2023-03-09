package byrybdyk.me.commands;

import byrybdyk.me.aplication.CollectionManager;

public interface Command {

    String getDescription();
    void execute();

    //String getName();


}
