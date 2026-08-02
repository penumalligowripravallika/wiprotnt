package miniproject.scenario3;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOClass {

    Connection con;

    public DAOClass() {
        con = ConnectionManager.getConnection();
    }

    public String getUserType(String userID) {

        String userType = "";

        try {

            String sql = "SELECT USERTYPE FROM USERS WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                userType = rs.getString("USERTYPE");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return userType;
    }
    public String changeUserType(String userID) {

        String result = "Update Failed";

        try {

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE USERS SET USERTYPE='Admin' WHERE USERID=?");

            ps.setString(1, userID);

            int rows = ps.executeUpdate();

            if (rows > 0)
                result = "Update Success";

        } catch (Exception e) {
            System.out.println(e);
        }

        return result;
    }

    }
    
