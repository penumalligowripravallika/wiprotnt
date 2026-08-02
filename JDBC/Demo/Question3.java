package Demo;
import java.sql.*;

public class Question3 {

    public static void main(String[] args) {

        try {
            // Load Oracle Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Connect to Oracle
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            // Create Statement
            Statement st = con.createStatement();

            // Execute Query
            ResultSet rs = st.executeQuery("SELECT id, first_name FROM emp1");

            // Display Data
            while(rs.next()) {
            	System.out.println(rs.getInt(1) + " " + rs.getString("first_name"));
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}