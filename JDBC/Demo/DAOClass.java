package Demo;

import java.sql.*;

public class DAOClass {

    Connection con;
    PreparedStatement ps;

    public DAOClass() throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");

        con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                "hr",
                "hr");
    }
    public void delete(int rollno) throws Exception {

        ps = con.prepareStatement("DELETE FROM STUDENT WHERE ROLLNO=?");

        ps.setInt(1, rollno);

        int rows = ps.executeUpdate();

        if(rows > 0)
            System.out.println("Record Deleted Successfully");
        else
            System.out.println("Record Not Found");
    }
    public void modify(int rollno, double fees) throws Exception {

        ps = con.prepareStatement("UPDATE STUDENT SET FEES=? WHERE ROLLNO=?");

        ps.setDouble(1, fees);
        ps.setInt(2, rollno);

        int rows = ps.executeUpdate();

        if(rows > 0)
            System.out.println("Record Updated Successfully");
        else
            System.out.println("Record Not Found");
    }
    public void display() throws Exception {

        ps = con.prepareStatement("SELECT * FROM STUDENT");

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(
                rs.getInt("ROLLNO") + " " +
                rs.getString("STUDENTNAME") + " " +
                rs.getString("STANDARD") + " " +
                rs.getDate("DATE_OF_BIRTH") + " " +
                rs.getDouble("FEES")
            );
        }
        
    }

}
