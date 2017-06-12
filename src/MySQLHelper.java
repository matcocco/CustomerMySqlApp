import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class MySQLHelper {
	
    private Connection connect = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    public void readDataBase() throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
        	// The MySQL driver is a JAR file that must be in the Build Path
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql://localhost/Customers?user=root&password=password");

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from customers");

            // PreparedStatements can use variables and are more efficient
            // The primary reason to use prepared statements: More Secure!
            // Secondary reason: you don't have to worry about quotes in your strings!
        
        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }


	// You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }

}
