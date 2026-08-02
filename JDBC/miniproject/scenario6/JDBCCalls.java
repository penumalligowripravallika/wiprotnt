package miniproject.scenario6;


public class JDBCCalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        String result = dao.changePassword("Admin123");

        System.out.println(result);

    }

}
