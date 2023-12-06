/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectDB;

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
    private static final String hostName = "127.0.0.1:3307";
    private static final String dbName = "qldancu";
    private static final String username = "root";
    private static final String password = "";
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static final String connectionURL = "jdbc:mysql://"+hostName+"/"+dbName;
    private static Connection conn;
    private static String urlstring;
    public static Connection connect() {
        try {
            Class.forName(driverName);
            try {
                conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/qldancu?useSSL=false", "root", "");
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
        return conn;
    }
}
