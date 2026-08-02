package miniproject.scenario8;

public class JDBCCalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        UserBean user = new UserBean();

        user.setUserId("KR1004");
        user.setPassword("KR1004");
        user.setName("Kiran");
        user.setIncorrectAttempts(0);
        user.setLockStatus(0);
        user.setUserType("Employee");

        String result = dao.addUser_2(user);

        System.out.println(result);
    }
}
