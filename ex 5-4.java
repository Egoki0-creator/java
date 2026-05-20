import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        game();
    }

    public static void game() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            // TITLE
            System.out.println("==================================");
            System.out.println("        THE LOST FRONTIER         ");
            System.out.println("==================================");

            // FIRST MENU (Level 1)
            System.out.println("\nChoose your path:");
            System.out.println("1. Enter the Dark Forest");
            System.out.println("2. Explore the Abandoned Town");
            System.out.println("3. Travel to the Mountains");
            System.out.println("4. Sail Across the River");
            System.out.println("5. Exit Game");

            System.out.println("\nEnter a number:");

            if (scanner.hasNextInt()) {

                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                if (choice == 5) {
                    System.out.println("Exiting game... Goodbye!");
                    break;
                }

                // SECOND MENU (Level 2)
                while (true) {

                    System.out.println("\n----------------------------------");

                    switch (choice) {
                        case 1:
                            System.out.println("You enter the Dark Forest...");
                            System.out.println("Strange sounds surround you.");
                            break;

                        case 2:
                            System.out.println("You explore the abandoned town...");
                            System.out.println("Dust and silence fill the streets.");
                            break;

                        case 3:
                            System.out.println("You travel into the mountains...");
                            System.out.println("The air becomes thin and cold.");
                            break;

                        case 4:
                            System.out.println("You sail across the river...");
                            System.out.println("The water is calm but mysterious.");
                            break;

                        default:
                            System.out.println("Unknown path...");
                            break;
                    }

                    System.out.println("\nPress Q to return to main menu:");

                    String input = scanner.nextLine();

                    if (input.equalsIgnoreCase("Q")) {
                        break; // return to main menu
                    } else {
                        System.out.println("Invalid input. Press Q to return.");
                    }
                }

            } else {
                // ignore invalid input
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // clear invalid input
            }
        }

        scanner.close();
    }
}
