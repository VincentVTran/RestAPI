package Rest;

import java.sql.*;

public class SQLDriver {

    private static Connection connect;

    public void setUp() throws SQLException {
        String url = "jdbc:mysql://remotemysql.com:3306/aX8hr4hqRS?useSSL=false"; //jdbc:mysql://hostname:port/username
        String user = "aX8hr4hqRS";
        String password = "QLPPgNA1bI";
        connect = DriverManager.getConnection(url, user, password);
    }

    public  void grabData() throws SQLException{
        Statement invoke = connect.createStatement();
        ResultSet recieve_data= invoke.executeQuery("SELECT * FROM Test");
        while(recieve_data.next()){
            System.out.println(recieve_data.getString(1));
        }
        recieve_data.close();
        invoke.close();
    }
}
