package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQLConnection extends SQLConnection {

    public MySQLConnection(String host, String port, String database, String user, String password) {
        super(host, port, database, user, password);
    }

    @Override
    public boolean checkField(String condit, String value, int col) {

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from " + database + " where c_sdt = " + condit);
            while (rs.next()) {
                if (rs.getString(col).equals(value)) {
                    return true;
                }
            }
            return false;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public boolean connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
            conn = DriverManager.getConnection(url, user, password);
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

    @Override
    public boolean insert(String str) {

        try {
            Statement s = conn.createStatement();
            s.execute(str);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public void disconnect() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean select(String query) {
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                if (rs.getString(1) != null) {
                    return true;
                }
            }
            return false;
        } catch (SQLException ex) {
            return false;
        }
    }

}
