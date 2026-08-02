package miniproject;

public class JDBCCalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        String userType = dao.getUserType("AB1001");

        System.out.println("User Type : " + userType);

    }

}