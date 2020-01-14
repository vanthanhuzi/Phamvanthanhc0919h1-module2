package ConnectionJDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection1 {

    public static Connection getJDBCConnection() {
        final String url = "jdbc:mysql://localhost:3306/test2";
        final String user = "root";
        final String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException es){
            es.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Connection connection = getJDBCConnection();
        if(connection!= null){
            System.out.println("Thành công ");

        }
        else System.out.println("not success");

    }
}
