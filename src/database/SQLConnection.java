package database;

import java.sql.*;

public abstract class SQLConnection {

    public String host;
    public String port;
    public String database;
    public String user;
    public String password;
    public Connection conn;

    public SQLConnection(String host, String port, String database, String user, String password) {
        this.host = host;
        this.port = port;
        this.database = database;
        this.user = user;
        this.password = password;
    }

    public abstract boolean connect();

    public abstract void disconnect();

    public Connection getConnection() {
        return conn;
    }

    public abstract boolean insert(String str);

    public abstract boolean select(String str);

    public abstract boolean checkField(String condit, String value, int col);

}
