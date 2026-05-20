import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readNumbers();
    }

    public static void readNumbers() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {

            System.out.println("Enter a number:");

            if (scanner.hasNextInt()) {

                int number = scanner.nextInt();
                sum += number;
                count++;

            } else {
                break;
            }
        }

        double avg = 0;

        if (count > 0) {
            avg = (double) sum / count;
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
