public class Zadanie5 {
    public static void main(String[] args) {
        double nettoShulga = 9.99;
        double bruttoShulga = nettoShulga * 1.23;
        double costBruttoShulga = bruttoShulga * 10000;
        double costNettoShulga = costBruttoShulga * 0.77;

        System.out.println("Cost of 1 brutto is " + bruttoShulga);
        System.out.println("Cost of 10000 brutto is " + costBruttoShulga);
        System.out.println("Cost of 10000 netto is " + costNettoShulga);
    }
}
