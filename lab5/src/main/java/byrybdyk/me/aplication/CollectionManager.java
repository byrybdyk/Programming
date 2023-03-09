package byrybdyk.me.aplication;

import byrybdyk.me.data.Route;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedHashMap;

import java.io.*;

public class CollectionManager {
    private LinkedHashMap<Integer, Route> routes;
    private LocalDate initializationDate;
    private HashMap<String, String> commandsInfo;

    private String pathToFile;

    {
        routes = new LinkedHashMap<>();
        commandsInfo = new HashMap<>();
        initializationDate = LocalDate.now();
    }





}

