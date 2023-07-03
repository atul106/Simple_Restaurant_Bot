import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, I am your Virtual Assistant\n");
        String str = sc.nextLine();
        System.out.println("How May I help you ?");
        System.out.println("1- I want to order something for breakfast");
        System.out.println("2- I want to order something for Lunch");
        System.out.println("3- I want to order something for Dinner");
        System.out.println("4- Show Something Special of your restaurant \n");

        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                System.out.println("Here's a Breakfast Menu: \n");

                String[] breakfastMenu = {"Idli", "MasalaDosa", "Dal Pakwaan", "Maggie", "Pohe"};

                for (String element : breakfastMenu) {
                    System.out.println(element);
                }

                displayMenuItems(breakfastMenu, sc);
                break;
            case 2:
                System.out.println("Here's a Lunch Menu: \n");

                String[] lunchMenu = {"Dal-Rice", "Chicken-Tikka", "Shahi-Paneer", "Fried-Rice", "Tandoori-Chicken"};

                for (String element : lunchMenu) {
                    System.out.println(element);
                }

                displayMenuItems(lunchMenu, sc);
                break;
            case 3:
                System.out.println("Here's a Dinner Menu : \n");

                String[] dinnerMenu = {"Dal-Rice", "Chicken-Tikka", "Palak-Paneer", "Kebabs", "Tandoori-Chicken"};

                for (String element : dinnerMenu) {
                    System.out.println(element);
                }

                displayMenuItems(dinnerMenu, sc);
                break;
            case 4:
                System.out.println("Here a Special Things of Restaurant: \n");

                String[] specialMenu = {"Amritsari-chole", "Rajma-Chawal", "Palak-Paneer", "Kebabs", "Tandoori-Chicken"};

                for (String element : specialMenu) {
                    System.out.println(element);
                }

                displayMenuItems(specialMenu, sc);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    public static void displayMenuItems(String[] menu, Scanner scanner) {
        System.out.println("Menu Items:\n");
        for (String menuItem : menu) {
            System.out.println(menuItem);
        }

        System.out.println("Enter the name of the item you want to order:");
        String order = scanner.nextLine();

        boolean isValidOrder = false;
        for (String menuItem : menu) {
            if (menuItem.equalsIgnoreCase(order)) {
                isValidOrder = true;
                break;
            }
        }

        if (isValidOrder) {
            System.out.println("You have selected: " + order);

            System.out.println("Anything else you want to order? (yes/no)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                displayMenuItems(menu, scanner);
            } else {
                System.out.println("Thank you for ordering.");
            }
        } else {
            System.out.println("Invalid item name.");
        }
    }
}
