package exercise15;

public class Bill {
    //Data member
    private TotalPay totalPay;
    private OrderDate orderDate;
    //Constructor
    public Bill(){
    }

    //Method

    public void setTotalPay(TotalPay pay){
        totalPay = pay;
    }

    public void setOrderDate(OrderDate date){
        orderDate = date;
    }
    public void getBill(){
        System.out.printf("Number of Bags Ordered: %d - $%.2f\n", totalPay.getNumberBags(), totalPay.getCoffeePrice());
        System.out.print("Box Used:\n");
        System.out.printf("         %d %-6s - $%.2f\n", totalPay.getLargeUsed(), "Large", totalPay.getLargePrice());
        System.out.printf("         %d %-6s - $%.2f\n", totalPay.getMediumUsed(), "Medium", totalPay.getMediumPrice());
        System.out.printf("         %d %-6s - $%.2f\n", totalPay.getSmallUsed(), "Small", totalPay.getSmallPrice());
        System.out.printf("Your total cost is:  $%.2f\n", totalPay.getTotalPrice());
        System.out.println("Date of Order:              " + orderDate.getOrderDate());
        System.out.println("Expected Date of Arrival:   " + orderDate.getReceiptDate());
    }
}
