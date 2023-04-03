package database;

public class UserAccount {

    public String u_sdt;
    public String u_pw;
    public String u_name;
    SQLConnection db;

    public UserAccount(String u_sdt, String u_pw, String u_name, SQLConnection db) {
        this.u_sdt = u_sdt;
        this.u_pw = u_pw;
        this.u_name = u_name;
        this.db = db;
    }

    public boolean addAccount(String num, String pass) {
        return db.insert("insert into " + db.database + " values('" + num + "', '', '" + pass + "')");
    }

    public boolean checkNumber(String num) {
        return db.select("select c_sdt from " + db.database + " where c_sdt = '" + num + "'");
    }

    public boolean checkPassword(String num, String pass) {
        return db.select("select c_sdt, c_pw from " + db.database + " where c_sdt = '" + num + "' and c_pw = '" + pass + "'");

    }
}
