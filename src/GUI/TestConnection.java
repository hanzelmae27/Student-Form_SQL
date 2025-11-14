package GUI;

import GUI.DBConnection;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class TestConnection {
    public static void main(String[] args) {
        Connection con = DBConnection.connect();
        if (con != null) {
            JOptionPane.showMessageDialog(null, "Database connected successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Database connection failed!");
        }
    }
}
