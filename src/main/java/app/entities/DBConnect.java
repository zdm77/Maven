package app.entities;

import java.sql.*;


public class DBConnect {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/wwwuniflora_trade";
    static final String USER = "postgres";
    static final String PASS = "Kkd37CkqfmDm";


    public static ResultSet setSQL(String sql) {

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = null;
            connection = DriverManager
                    .getConnection(DB_URL, USER, PASS);
            Statement statement = null;
            statement = connection.createStatement();
            ResultSet r1 = statement.executeQuery(sql);
          /*  while (r1.next()) {
                System.out.println("Номер в выборке #" + r1.getRow()
                        + "\t Номер в базе #" + r1.getInt("id")
                        + "\t" + r1.getString("name"));
            }*/
            return r1;
        } catch (Exception e) {
            return null;

        }
    }
}
