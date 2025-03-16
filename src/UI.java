import java.util.Scanner;

public class UI {
    private static final Scanner scanner = new Scanner(System.in);

    public static void mainMenu() {
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
                case 0:
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
            System.out.println("[4] Show All Users");
            System.out.println("[5] Add Book To User");
            System.out.println("[6] Remove Book From User");
            System.out.println("[7] Search Book");
            System.out.println("[0] Back To Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    UIAddUser();
                    break;
                case 2:
                    UIRemoveUser();
                    break;
                case 3:
                    UISearchUser();
                    break;
                case 4:
                    System.out.println("Showing All Users...");
                    ManageUsers.showAllUsers();

                    break;
                case 5:

                    break;
                case 0:
                    System.out.println("Returning to Main Menu...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void UISearchUser() {
        System.out.println("Searching User...");
        sleep(1000);
        System.out.print("Enter Id: ");
        String id = scanner.next();
        System.out.println("Entering Id...");
        sleep(1000);
        try {
            var target = ManageUsers.getUser(id);
            System.out.println("-------- User found --------");
            sleep(1000);
            System.out.println("------- User Info ------- " +
                    "\nName: " + target.getName() +
                    "\nAge: " + target.getAge() +
                    "\nGender: " + target.getGender() +
                    "\nJoinTime: " + target.getJoinTime() +
                    "\nid: " + target.getId()
            );
            System.out.println("Returning to Main Menu...");
            sleep(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sleep(2000);
        }
    }

    private static void UIRemoveUser() {
        System.out.println("Remove User functionality here...");
        sleep(1000);
        System.out.print("Enter your Id: ");
        String id = scanner.next();
        System.out.println("Entering Id...");
        sleep(500);
        System.out.println("Removing User...");
        sleep(500);
        ManageUsers.removeUser(id);
        sleep(2500);
    }

    private static void UIAddUser() {
        System.out.println("Add User functionality here...");
        sleep(1000);
        System.out.print("Enter your Name: ");
        String name = scanner.next();
        System.out.println("Entering Name...");
        sleep(1000);
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        System.out.println("Entering Age...");
        sleep(1000);
        System.out.print("Enter Gender: ");
        String gender = scanner.next();
        System.out.println("Entering Gender...");
        sleep(1000);
        System.out.print("Enter JoinTime...");
        int joinTime = scanner.nextInt();
        System.out.println("Entering JoinTime...");
        sleep(500);
        System.out.println("Creating User...");
        sleep(500);
        ManageUsers.addUser(name, age, gender, joinTime);
        sleep(2500);
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

    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }
    }
}
