package miniproject.scenario3;

public class JDBCCalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        String result = dao.changeUserType("TA1002");

        System.out.println(result);

    }

}