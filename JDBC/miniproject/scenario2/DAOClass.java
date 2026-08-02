package miniproject.scenario2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOClass {

    Connection con;

    public DAOClass() {
        con = ConnectionManager.getConnection();
    }

    public String getIncorrectAttempts(String userID) {

        String result = "";

        try {

            String sql = "SELECT INCORRECTATTEMPTS FROM USERS WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                int attempts = rs.getInt("INCORRECTATTEMPTS");

                if (attempts == 0)
                    result = "No Incorrect Attempt";
                else if (attempts == 1)
                    result = "One Time";
                else
                    result = "Incorrect Attempt Exceeded";
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return result;
    }
}