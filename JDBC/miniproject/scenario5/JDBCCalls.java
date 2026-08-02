package miniproject.scenario5;

public class JDBCCalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        String result = dao.changeName("RS1003", "Ramesh");

        System.out.println(result);

    }
}
