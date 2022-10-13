public class Zadanie3 {
    public static void main(String[] args) {

        int randomNumberShulga = (int)(Math.random() * 100 + 1);
        System.out.println("Random number is " + randomNumberShulga);
        if(randomNumberShulga % 2 != 0)
            System.out.println("This number is not even");
        else
            System.out.println("This number is even");

    }
}
