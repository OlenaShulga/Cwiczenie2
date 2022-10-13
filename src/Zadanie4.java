public class Zadanie4 {
    public static void main(String[] args) {
        int amountOfBricksShulga = 73;
        int containerCapacityShulga = 6;
        int numberOfFullContainersShulga, amountOfBricksInLastContainerShulga;

        numberOfFullContainersShulga = (int)(amountOfBricksShulga / containerCapacityShulga);
        amountOfBricksInLastContainerShulga = amountOfBricksShulga % containerCapacityShulga;
        System.out.println("Number of full containers is " + numberOfFullContainersShulga);
        System.out.println("Number of all containers is " + (numberOfFullContainersShulga + 1));
        System.out.println("Amount of bricks in last container is " + amountOfBricksInLastContainerShulga);
    }
}
