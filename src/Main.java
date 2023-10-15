
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inch = 39.37;
        double foot = 3.28;
        double metric = 0;
        double mile = 1609.35;

        String inches = "Inches";
        String feet = "Feet";
        String miles = " Miles";
        String trash = "";

        boolean done = false;

        do {
            System.out.println("Please enter the measurement in meters: ");
            if (scanner.hasNextDouble()) {
                metric = scanner.nextDouble();
                done = true;
                scanner.nextLine();
            } else {
                trash = scanner.nextLine();
                System.out.println("Please enter a valid input, not " + trash);
            }
        } while (!done);

        double convertedInches = metric * inch;
        double convertedFeet = metric * foot;
        double convertedMiles = metric * mile;

        System.out.printf("%-12s: %-12.3f%n", inches, convertedInches);
        System.out.printf("%-12s: %-12.3f%n", feet, convertedFeet);
        System.out.printf("%-12s: %-12.3f%n", miles, convertedMiles);
    }

}

