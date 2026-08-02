package miniproject.scenario2;
public class JDBCCalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        String result = dao.getIncorrectAttempts("AB1001");

        System.out.println(result);

    }

}