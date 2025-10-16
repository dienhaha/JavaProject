package exercise16;

public class CoffeBag {
    //DATA MEMBER
    public final double PRICE = 5.99;
    public final double SALES_TAX = 0.0725;
    private double totalPrice,totalPriceWithTax;
    public double unitWeight;
    public int numberOfUnits;
    //CONSTRUCTOR

    public CoffeBag(){
        totalPrice = 0.0;
        totalPriceWithTax = 0.0;
        unitWeight = 0.0;
        numberOfUnits = 0;
    }
    //METHOD
    public void setUnitWeight(double weight ){
        unitWeight = weight;
    }

    public void setNumberWeight(int number){
        numberOfUnits = number;
    }

    public double getTotalPriceWithTax(){
        totalPrice = unitWeight * numberOfUnits * PRICE;
        totalPriceWithTax = totalPrice + totalPrice * SALES_TAX;
        return totalPriceWithTax;
    }
}
