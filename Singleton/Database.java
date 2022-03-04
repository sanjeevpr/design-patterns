package Singleton;

public class Database {
    private static Database database;

    private Database() {}

    public static Database getInstance() {
        if(database == null) {
            return database = new Database();
        }
        return database;
    }

    public void query(String sql) {
        System.out.println(sql);
    }
}
