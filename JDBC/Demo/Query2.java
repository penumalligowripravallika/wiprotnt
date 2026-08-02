package Demo;

import java.sql.*;

public class Query2 {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "system",
                    "NewPassword123");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                    "SELECT ENAME, JOB, SAL, COMM FROM EMP WHERE SAL > 1000 AND SAL < 2000");

            while (rs.next()) {

                System.out.println(
                        rs.getString("ENAME") + "   " +
                        rs.getString("JOB") + "   " +
                        rs.getInt("SAL") + "   " +
                        rs.getString("COMM"));
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}