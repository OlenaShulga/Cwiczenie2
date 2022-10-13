public class Zadanie2 {
    public static void main(String[] args) {
        float earthWeightShulga = 52F;
        float marsWeightShulga;
        double doubleWeightShulga;
        int intWeightShulga, operationCharShulga;
        char charWeightShulga;

        marsWeightShulga = earthWeightShulga * 0.38F;
        System.out.println(earthWeightShulga + " kg on Earth is " + marsWeightShulga + " kg on Mars");
        doubleWeightShulga = (double)marsWeightShulga;
        System.out.println("Kilograms on Mars after converting to double " + doubleWeightShulga);
        System.out.printf("Kilograms on Mars displayed to four decimal places %.4f%n", doubleWeightShulga);
        intWeightShulga = (int)doubleWeightShulga;
        System.out.println("Kilograms on Mars after converting to integer " + intWeightShulga);
        charWeightShulga = (char)intWeightShulga;
        System.out.println("Kilograms on Mars after converting to char " + charWeightShulga);
        operationCharShulga = (int)(charWeightShulga + 'n');
        System.out.println("An example of operation on the char type " + operationCharShulga);

    }
}
