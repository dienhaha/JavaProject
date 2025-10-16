package exercise6;

public class TotalSales {
    //DATE MEMBER
    private double totalSales;
    private int numberOfA_Seats;
    private int numberOfB_Seats;
    private int numberOfC_Seats;

    private double pricePerA_Seat;
    private double pricePerB_Seat;
    private double pricePerC_Seat;

    //CONSTRUCTOR
    public TotalSales(){
        numberOfA_Seats = 0;
        numberOfB_Seats = 0;
        numberOfC_Seats = 0;

        pricePerA_Seat = 0.0;
        pricePerB_Seat = 0.0;
        pricePerC_Seat = 0.0;
    }

    //METHOD

    public void setNumberOfA_Seats(int number) {
        numberOfA_Seats = number;
    }
    public void setPricePerA_Seat(double price){
        pricePerA_Seat = price;
    }

    public void setNumberOfC_Seats(int number) {
        numberOfC_Seats = number;
    }
    public void setPricePerC_Seat(double price){
        pricePerC_Seat = price;
    }

    public void setNumberOfB_Seats(int number) {
        numberOfB_Seats = number;
    }
    public void setPricePerB_Seat(double price){
        pricePerB_Seat = price;
    }

    //compute method
    public double getTotalSales() {
        totalSales = numberOfA_Seats * pricePerA_Seat +
                     numberOfB_Seats * pricePerB_Seat +
                     numberOfC_Seats * pricePerC_Seat;

        return totalSales;
    }
}
