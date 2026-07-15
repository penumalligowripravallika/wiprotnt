package datetimeapi;

import java.time.LocalDate;

public class LeapYear {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        if(today.isLeapYear())
            System.out.println(today.getYear() + " is Leap Year");
        else
            System.out.println(today.getYear() + " is Not Leap Year");
    }
}
