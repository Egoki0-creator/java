import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double min = null;
        Double max = null;

        while (true) {

            System.out.println("Enter a number or any character to quit:");

            if (scanner.hasNextDouble()) {

                double number = scanner.nextDouble();

                if (min == null || number < min) {
                    min = number;
                }

                if (max == null || number > max) {
                    max = number;
                }

                System.out.println("Min = " + min);
                System.out.println("Max = " + max);

            } else {
                break;
            }
        }

        System.out.println("Loop ended.");
        scanner.close();
    }
}
