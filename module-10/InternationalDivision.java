/*
* 07/13/2025
* InternationalDivision.java
*
* This program represents a division located in another 
* country, adding fields for country and language.*/
public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division:");
        System.out.println("Name: " + divisionName);
        System.out.println("Account #: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}
