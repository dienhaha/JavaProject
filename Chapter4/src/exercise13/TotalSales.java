package exercise13;

public class TotalSales {
    //DATE MEMBER
    public double totalSales;
    //CONSTRUCTOR
    public TotalSales(){
        totalSales = 0.0;
    }

    //METHOD
    //compute method
    public double getTotalSales(Seat seatA, Seat seatB, Seat seatC) {
        totalSales = seatA.getNumberOfSeat() * seatA.getPrice() +
                     seatB.getNumberOfSeat() * seatB.getPrice() +
                     seatC.getNumberOfSeat() * seatC.getPrice();
        return totalSales;
    }
}
