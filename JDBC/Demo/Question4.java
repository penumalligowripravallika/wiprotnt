package Demo;
import java.sql.*;

public class Question4 {

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
            ResultSet rs = st.executeQuery("SELECT id, first_name, last_name, dept_id FROM emp1 WHERE dept_id > 10 AND dept_id < 40");

            // Display Data
            while(rs.next()) {
            	System.out.println(
            		    rs.getInt("id") + " " +
            		    rs.getString("first_name") + " " +
            		    rs.getString("last_name") + " " +
            		    rs.getInt("dept_id")
            		);
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
