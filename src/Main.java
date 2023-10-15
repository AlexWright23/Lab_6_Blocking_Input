import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double height = 0;
        double width = 0;

        boolean valInput = false;

        do {
            System.out.print("Please enter the height of the rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                valInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number");
                scanner.next();
            }
        }while (!valInput);

        valInput = false;

        do {
            System.out.print("Please enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                valInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number");
                scanner.next();
            }
        }while (!valInput);

        valInput = false;

        double area = height * width;
        System.out.println("Area of the rectangle is: " + area);

        double perimeter = 2 * (height * width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        double diagonalLength =  java.lang.Math.sqrt(width * width + height * height);
        System.out.println("The length of the diagonal is: " + diagonalLength);

        scanner.close();
    }
}

