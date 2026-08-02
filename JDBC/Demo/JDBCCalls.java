package Demo;

public class JDBCCalls {

    public static void main(String[] args) {

        try {

            DAOClass dao = new DAOClass();

            dao.display();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}