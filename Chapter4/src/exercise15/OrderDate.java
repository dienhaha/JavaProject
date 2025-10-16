package exercise15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class OrderDate {
    //Data member
    private SimpleDateFormat sdf;
    private String orderDate;
    private String[] part;
    private int month,day,year;
    private GregorianCalendar orderDate1, orderDate2;
    //Constructor
    public OrderDate(String date){
        sdf = new SimpleDateFormat("MMMM dd, yyyy");

        orderDate = date;
        part = orderDate.split("/");
        month = Integer.parseInt(part[0]) - 1;        //month in Gregorian start at 0
        day = Integer.parseInt(part[1]);
        year = Integer.parseInt(part[2]);

        //get Order Date
        orderDate1 = new GregorianCalendar();
        orderDate1.set(year, month, day);
        //add 14 days of delivery
        orderDate2 = new GregorianCalendar();
        orderDate2.set(year, month, day);
        orderDate2.add(Calendar.DAY_OF_YEAR, 14);
    }
    //Method
    public String getOrderDate(){
        return sdf.format(orderDate1.getTime());
    }
    public String getReceiptDate(){
        return sdf.format(orderDate2.getTime());
    }

}
