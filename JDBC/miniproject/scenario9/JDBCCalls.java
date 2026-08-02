package miniproject.scenario9;


import java.util.ArrayList;

public class JDBCCalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        ArrayList<UserBean> list = dao.getUsers("Admin");

        for (UserBean user : list) {

            System.out.println("User ID : " + user.getUserId());
            System.out.println("Password : " + user.getPassword());
            System.out.println("Name : " + user.getName());
            System.out.println("Incorrect Attempts : " + user.getIncorrectAttempts());
            System.out.println("Lock Status : " + user.getLockStatus());
            System.out.println("User Type : " + user.getUserType());

            System.out.println("---------------------------");
        }
    }
}