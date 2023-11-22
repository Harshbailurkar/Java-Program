import java.sql.*;

public class EstablishConnection {
    public static void main(String[] args) throws Exception {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection cn = DriverManager.getConnection("jdbc:odbc:My-Database", "", "");
        Statement stmt = cn.createStatement();
        String query = "select * from names";
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println(" " + rs.getInt(1) + " " + rs.getString(2));
        }

    }
}