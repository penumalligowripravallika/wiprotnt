package miniproject.scenario6;
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
    public int getLockStatus() {

        int count = 0;

        try {

            String sql = "SELECT COUNT(*) FROM USERS WHERE LOCKSTATUS=0";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return count;
    }
    public String changeName(String id, String name) {

        String result = "Failed";

        try {

            String sql = "UPDATE USERS SET NAME=? WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                result = "Success";
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return result;
    }
    public String changePassword(String password) {

        String result = "0";

        try {

            String sql = "UPDATE USERS SET PASSWORD=? WHERE USERTYPE='Admin'";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, password);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                result = "Changed";
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return result;
    }

    }
    



