package api;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDatabase {
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://118.24.32.220:3306/";
    private static String USER = "xuhui";
    private static String PASSWORD = "916586467";
    public Connection conn;

    public ConnectDatabase(String Database) {
        try {
            Class.forName(DRIVER);
            String url = URL + Database + "?serverTimezone=UTC&useSSL=true&useUnicode=true&characterEncoding=utf8";
            conn = DriverManager.getConnection(url, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return conn;
    }
}