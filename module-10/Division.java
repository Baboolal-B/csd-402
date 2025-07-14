/*
* 07/13/2025
* Division.java
*
* This program defines an abstract class with common fields 
* for a company's division name and account number.*/

public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}
