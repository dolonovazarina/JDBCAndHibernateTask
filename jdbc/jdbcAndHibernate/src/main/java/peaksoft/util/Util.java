package peaksoft.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String User = "postgres";
    private static final String Pass = "post";

    public static Connection connection() {
        // реализуйте настройку соеденения с БД

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, User, Pass);
            System.out.println("Connect");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


}
// реализуйте настройку соеденения с БД

