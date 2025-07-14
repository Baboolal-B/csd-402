/*
* 07/13/2025
* UseDivision.java
*
* This program creates two international and two domestic division objects.*/
public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision intl1 = new InternationalDivision("Arctic Research", 3001, "Norway (Svalbard)", "Norwegian");
        InternationalDivision intl2 = new InternationalDivision("Tropical Expansion", 3002, "Bali, Indonesia", "Indonesian");

        DomesticDivision dom1 = new DomesticDivision("Hawaiian Outreach", 4001, "Hawaii");
        DomesticDivision dom2 = new DomesticDivision("Rocky Mountain Tech", 4002, "Colorado");

        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}
