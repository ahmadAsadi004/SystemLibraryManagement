import java.util.Scanner;

public class UI {
    private static final Scanner scanner = new Scanner(System.in);

    public static void mainMenu(String[] args) {
        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("[1] Users Management System");
            System.out.println("[2] Library Management System");
            System.out.println("[0] Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    usersManagementSystem();
                    break;
                case 2:
                    libraryManagementSystem();
                    break;
                case 3:
                    System.out.println("Exiting the program... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void usersManagementSystem() {

        while (true) {
            System.out.println("\n--- Users Management System ---");
            System.out.println("[1] Add User");
            System.out.println("[2] Remove User");
            System.out.println("[3] Search User");
            System.out.println("[4] Add Book To User");
            System.out.println("[5] Remove Book From User");
            System.out.println("[6] Search Book");
            System.out.println("[0] Back To Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Add User functionality here...");
                    break;
                case 2:
                    System.out.println("Remove User functionality here...");
                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    return;
                case 4:
                    System.out.println("Exiting the program... Goodbye!");
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void libraryManagementSystem() {
        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("[1] Add Book");
            System.out.println("[2] Remove Book");
            System.out.println("[3] Search Book");
            System.out.println("[0] Back To Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Add Book functionality here...");
                    break;
                case 2:
                    System.out.println("Remove Book functionality here...");
                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
