package miniproject.scenario4;

public class JDBCCalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        int count = dao.getLockStatus();

        System.out.println("Lock Status 0 Count : " + count);

    }

}
