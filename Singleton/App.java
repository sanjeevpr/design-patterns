package Singleton;

public class App {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.query("SELECT * ...");
    }
}