package exercise11;

import java.util.GregorianCalendar;

public class LibraryCard {
    // Data Members

    //student owner of this card
    private Student owner;
    //number of books borrowed
    private int borrowCnt;
    //GregorianCalender
    private GregorianCalendar date;

    //Constructor
    public LibraryCard() {
        owner = null;
        borrowCnt = 0;
    }

    //numOfBooks are checked out
    public void checkOut(int numOfBooks) {
        borrowCnt = borrowCnt + numOfBooks;
    }

    //Returns the number of books borrowed
    public int getNumberOfBooks() {
        return borrowCnt;
    }

    //Returns the name of the owner of this card
    public String getOwnerName() {
        return owner.getName();
    }

    //Sets owner of this card to student
    public void setOwner(Student student) {
        owner = student;
    }

    //sets the expiration date
    public void setExpDate(GregorianCalendar date) {
        return;
    }

    //returns the expiration year
    public int getExpYear() {
        return 0;
    }

    //returns the expiration month
    public int getExpMonth() {
        return 0;
    }

    //returns the expiration day
    public int getExpDay() {
        return 0;
    }


    //Returns the string representation of this card
    public String toString() {
        return "Owner Name: " + owner.getName() + "\n" +
                " Email: " + owner.getEmail() + "\n" +
                "Books Borrowed: " + borrowCnt;
    }
}
