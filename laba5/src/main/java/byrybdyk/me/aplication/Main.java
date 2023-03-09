package byrybdyk.me.aplication;
//my own branch byrybdyk
public class Main {
    public static void main(String[] args) {
        CollectionManager collectionManager = new CollectionManager();
        new CommandReader (collectionManager).start();
    }
}