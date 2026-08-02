package miniproject.scenario7;


public class JDBCCalls {

    public static void main(String[] args) {

        UserBean user = new UserBean();

        user.setUserId("KV1004");
        user.setPassword("KV1004");
        user.setName("Kavya");
        user.setIncorrectAttempts(0);
        user.setLockStatus(0);
        user.setUserType("Employee");

        DAOClass dao = new DAOClass();

        String result = dao.addUser_1(user);

        System.out.println(result);
    }
}
