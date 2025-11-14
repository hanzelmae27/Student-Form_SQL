package GUI;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection connect() {
        Connection conn = null;
        try {
            
            String url = "jdbc:mysql://localhost:3306/studentformdb";
            String user = "root";
            String password = ""; // or your MySQL password if you set one

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully!");
        } catch (Exception e) {
            System.out.println("Connection error: " + e.getMessage());
        }
        return conn;
    }
}

