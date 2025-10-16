//Roll a die three times

package exercise5;

public class RollDie {
    public static void main(String[] args) throws InterruptedException {
        Die die = new Die();

        //Roll 3 times and print out each time roll
        die.roll();
        System.out.println("First attempt: "+ die.getNumber());

        Thread.sleep(1000);
        die.roll();
        System.out.println("Second attempt: "+ die.getNumber());

        Thread.sleep(1000);
        die.roll();
        System.out.println("Third attempt: "+ die.getNumber());
    }
}
