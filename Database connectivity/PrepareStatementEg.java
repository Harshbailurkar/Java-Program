import java.sql.*;

public class PrepareStatementEg {
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database_name";
    static final String USERNAME = "your_username";
    static final String PASSWORD = "your_password";

    public static void main(String[] args) throws Exception {

        // Establishing a connection to the database
        Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

        // Insertion
        String insertQuery = "INSERT INTO bank (AccountNo, CustomerName, Balance, Phone, Address) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
        insertStatement.setInt(1, 12345); // Replace with actual values
        insertStatement.setString(2, "John Doe");
        insertStatement.setDouble(3, 25000.00);
        insertStatement.setString(4, "1234567890");
        insertStatement.setString(5, "123 Main St");
        insertStatement.executeUpdate();

        // Updation
        String updateQuery = "UPDATE bank SET Balance = ? WHERE CustomerName = ?";
        PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
        updateStatement.setDouble(1, 30000.00);
        updateStatement.setString(2, "John Doe");
        updateStatement.executeUpdate();

        // Deletion
        String deleteQuery = "DELETE FROM bank WHERE CustomerName = ?";
        PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery);
        deleteStatement.setString(1, "John Doe");
        deleteStatement.executeUpdate();

        // Printing customers with balance > 20,000
        String selectQuery = "SELECT * FROM bank WHERE Balance > 20000";
        Statement selectStatement = conn.createStatement();
        ResultSet resultSet = selectStatement.executeQuery(selectQuery);

        while (resultSet.next()) {
            int accountNo = resultSet.getInt("AccountNo");
            String customerName = resultSet.getString("CustomerName");
            double balance = resultSet.getDouble("Balance");
            String phone = resultSet.getString("Phone");
            String address = resultSet.getString("Address");

            System.out.println("AccountNo: " + accountNo + ", CustomerName: " + customerName +
                    ", Balance: " + balance + ", Phone: " + phone + ", Address: " + address);

        }
        conn.close();
    }
}
