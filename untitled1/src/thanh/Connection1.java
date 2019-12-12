package thanh;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Connection {
    private static Connection getInstance(){
       final String url = "jdbc:mysql:localhost:3306/test2";
       final String user = "root";
       final String password = "thanh02010609";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {   
                return DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
