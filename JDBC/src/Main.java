import java.sql.*;

public class Main {
    public static void main(String[] args) throws  ClassNotFoundException , SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String databaseUrl = "jdbc:mysql://localhost/ramesh";

        // connection database
        Connection conn = DriverManager.getConnection(databaseUrl,"root","root");
        System.out.println("database connecton succedded");

        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("select * from students");
        while (rs.next())
        {
            String name = rs.getString("name");
            System.out.println(name);
            System.out.println(rs.getString("idstudents "));

        }
    }
}