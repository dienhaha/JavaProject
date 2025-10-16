package exercise10;

public class Bicycle {
    // Data Member
    private Student ownerName;

    //Constructor: Initializes the data member
    public Bicycle( ) {
        ownerName = null;
    }

    //Returns the name of this bicycle's owner
    public String getOwnerName( ) {
        return ownerName.getName();
    }

    //Assigns the name of this bicycle's owner
    public void setOwnerName(Student name) {
        ownerName = name;
    }
}
