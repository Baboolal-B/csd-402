/*
* 07/13/2025
* DomesticDivision.java
*
* This program represents a U.S.-based division with an additional field for the state.*/

public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division:");
        System.out.println("Name: " + divisionName);
        System.out.println("Account #: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}
