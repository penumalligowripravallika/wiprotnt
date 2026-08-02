package callable;

public class JDBCCalls {

    public static void main(String[] args) {

        try {

            DAOClass dao = new DAOClass();

            int empno = 100;

            double netSalary = dao.getNetSalary(empno);

            System.out.println("Employee Number : " + empno);
            System.out.println("Net Salary      : " + netSalary);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
