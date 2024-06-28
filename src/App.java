import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Main:");
        System.out.println("1-Admin");
        System.out.println("2-User");
        int main = scanner.nextInt();
        scanner.nextLine();  // Consume the newline left-over

        switch (main) {
            case 1:
                AdminMain adminMain = new AdminMain();
                System.out.println("1-View Menu");
                System.out.println("2-View Additions");
                System.out.println("3-Add New Item to Menu");
                System.out.println("4-Add New Addition");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume the newline left-over

                switch (choice) {
                    case 1:
                        adminMain.ViewMenu();
                        break;
                    case 2:
                        adminMain.ViewAdditions();
                        break;
                    case 3:
                        System.out.println("New Sandwich:");
                        System.out.println("Enter Name:");
                        String burgerName = scanner.nextLine();
                        System.out.println("Enter Price:");
                        int burgerPrice = scanner.nextInt();
                        scanner.nextLine();  // Consume the newline left-over
                        adminMain.addSandwich(burgerName, burgerPrice);
                        break;  // Add break here to avoid falling through
                    case 4:
                        System.out.println("New Additions:");
                        System.out.println("Enter Name:");
                        String additionName = scanner.nextLine();
                        System.out.println("Enter Price:");
                        int additionPrice = scanner.nextInt();
                        scanner.nextLine();  // Consume the newline left-over
                        adminMain.newAddition(additionName, additionPrice);
                        adminMain.ViewAdditions();
                        break;  // Add break here to avoid falling through
                    default:
                        System.out.println("Wrong choice");
                }
                break;
            case 2:
                UserMain userMain = new UserMain();
                System.out.println("Welcome User to Restaurant!");
                System.out.println("Menu:");
                System.out.println("1-Beef Burger");
                System.out.println("2-Chicken Burger");
                System.out.println("3-Cheese Burger");
                System.out.println("Please Select option:");
                int option = scanner.nextInt();
                scanner.nextLine();  // Consume the newline left-over
                userMain.requestOrder(option);

                System.out.println("Do you like to add any additions?");
                System.out.println("1-Yes");
                System.out.println("2-No");
                int add = scanner.nextInt();
                scanner.nextLine();  // Consume the newline left-over

                switch (add) {
                    case 1:
                        System.out.println("Additions:");
                        System.out.println("1-Ketchup");
                        System.out.println("2-Mayonnaise");
                        System.out.println("3-Tomatoes");
                        System.out.println("4-Cheese");
                        System.out.println("Please Select options (comma-separated):");
                        String addons = scanner.nextLine();
                        String[] addonArray = addons.split(",");
                        userMain.requestOrder(addonArray);

                        System.out.println("Your order is:");
                        userMain.gettingReceipt();
                        System.out.println("1-Confirm");
                        System.out.println("2-Back to Menu");
                        int confirm = scanner.nextInt();
                        scanner.nextLine();  // Consume the newline left-over

                        switch (confirm) {
                            case 1:
                                userMain.gettingReceipt();
                                break;
                            default:
                                System.out.println("Returning to menu...");
                        }
                        break;
                    default:
                        System.out.println("No additions.");
                }
                break;
            default:
                System.out.println("Neither User nor Admin!");
        }

        scanner.close();
    }
}
