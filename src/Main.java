import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double efficiency = 0;
        double pricePerGallon = 0;
        double gallons = 0;

        boolean valInput = false;

        do {

            System.out.print("Please enter the number of gallons in the tank: ");
            if (scanner.hasNextDouble()) {
                gallons = scanner.nextDouble();
                valInput = true;
            } else {
                System.out.println("Invalid input, please enter a valid number. ");
                scanner.next();
            }

        }while (!valInput);

        valInput = false;

        do {
            System.out.print("Please enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                efficiency = scanner.nextDouble();
                valInput = true;
            }else {
                System.out.println("Invalid input, please enter a valid number. ");
                scanner.next();
            }
        }while (!valInput);

        valInput = false;

        do {
            System.out.print("Please enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                valInput = true;
            }else {
                System.out.println("Invalid input, please enter a valid number. ");
                scanner.next();
            }
        }while (!valInput);

        double costPer100Miles = (100.0 / efficiency) * pricePerGallon;
        double distanceWithGas = efficiency * gallons;

        System.out.println("Cost per 100 miles: $" + String.format("%.2f", costPer100Miles));
        System.out.println("Distance the car can go with the gas in the tank: " + String.format("%.2f", distanceWithGas) + " miles");

        scanner.close();
    }
}

