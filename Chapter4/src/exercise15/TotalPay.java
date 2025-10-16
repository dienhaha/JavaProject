package exercise15;

public class TotalPay {
    //Data member
    private final double PRICE = 5.50, LARGE_BOX = 1.80, MEDIUM_BOX = 1.00, SMALL_BOX = 0.60;
    private int numberBags;
    private double coffeePrice, largePrice, mediumPrice, smallPrice, totalPrice;
    private int largeUsed, mediumUsed, smallUsed;

    //Constructor
    public TotalPay(int bags) {
        numberBags = bags;
        coffeePrice = numberBags * PRICE;

        largeUsed = bags / 20;
        largePrice = largeUsed * LARGE_BOX;

        mediumUsed = (bags % 20) / 10;
        mediumPrice = mediumUsed * MEDIUM_BOX;

        smallUsed = Math.ceilDiv(((bags % 20) % 10), 5);
        smallPrice = smallUsed * SMALL_BOX;

        totalPrice = coffeePrice + largePrice + mediumPrice + smallPrice;
    }
    //Method

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getNumberBags() {
        return numberBags;
    }

    public int getLargeUsed() {
        return largeUsed;
    }
    public int getMediumUsed() {
        return mediumUsed;
    }
    public int getSmallUsed() {
        return smallUsed;
    }

    public double getCoffeePrice() {
        return coffeePrice;
    }

    public double getLargePrice() {
        return largePrice;
    }
    public double getMediumPrice() {
        return mediumPrice;
    }
    public double getSmallPrice() {
        return smallPrice;
    }
}
