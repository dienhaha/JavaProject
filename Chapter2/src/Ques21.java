/*
    21. Repeat Exercise 20, but this time use this format: Monday December 10,
    2008.
 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class Ques21 {
    public static void main(String[] args) {
        Date toDay = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE MMMM dd, yyyy.");
        System.out.println("Today is " + sdf.format(toDay));
    }
}
