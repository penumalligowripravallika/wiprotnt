package callable;

import java.sql.*;

public class DAOClass {

    Connection con;
    CallableStatement cs;

    public DAOClass() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                "hr",
                "hr");
    }

    public double getNetSalary(int empno) throws Exception {

        cs = con.prepareCall("{call NETSALARY(?,?)}");

        cs.setInt(1, empno);

        cs.registerOutParameter(2, Types.DOUBLE);

        cs.execute();

        return cs.getDouble(2);
    }
}
