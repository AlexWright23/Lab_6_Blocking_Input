import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double c = 0;
        double f = 0;
        boolean done = false;
        String trash = "";

        do {

            System.out.print("Please enter the temperature in celsius to be converted into fahrenheit: ");

            if (scanner.hasNextDouble()) {

                c = scanner.nextDouble();
                f = (c * 9/5) + 32;

                System.out.println(c + " in fahrenheit is " + f);

                done = true;

            } else {

                trash = scanner.nextLine();

                System.out.println("Please enter a valid input, not " + trash);
            }

        } while (!done);
    }
}

