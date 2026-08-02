package miniproject.scenario11;

public class JDBCCalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        String[] names = dao.getNames();

        for (String name : names) {
            System.out.println(name);
        }
    }
}
