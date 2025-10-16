package exercise13;

public class Seat {
    //DATA MEMBER
    public double seatPrice;
    public int numberOfSeat;

    //CONSTRUCTOR
    public Seat() {
        seatPrice = 0.0;
        numberOfSeat = 0;
    }

    //METHOD
    public void setNumberOfSeat(int number) {
        numberOfSeat = number;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setPrice(double price) {
        seatPrice = price;
    }

    public double getPrice() {
        return seatPrice;
    }
}
