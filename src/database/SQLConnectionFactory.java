package database;

public class SQLConnectionFactory {

    public static SQLConnection createConnection(String dbtype, String host, String port, String database, String user, String password) {
        switch (dbtype) {
            case "mysql":
                return new MySQLConnection(host, port, database, user, password);
            // Add more cases for other database types here
            default:
                throw new IllegalArgumentException("Database không hợp lệ.");
        }
    }
}
