import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count <= 5) {

            System.out.println("Enter number #" + count + ":");

            if (scanner.hasNextInt()) {

                int number = scanner.nextInt();

                sum += number;
                count++;

            } else {

                System.out.println("Invalid number");

                scanner.nextLine(); // clear invalid input
            }
        }

        System.out.println("Sum = " + sum);

        scanner.close();
    }
}
