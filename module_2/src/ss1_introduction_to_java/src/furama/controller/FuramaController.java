package ss8_mvc.controller;

import ss8_mvc.service.IFuramaService;
import ss8_mvc.service.impl.FuramaService;

import java.util.Scanner;

public class FuramaController implements IFuramaService {
    public void displayMainMenu() {
        IFuramaService furamaService = new FuramaService();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Furama Resort Management System");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            try {
                switch (choice) {
                    case 1:
                        displayEmployeeMenu();
                        break;
                    case 2:
                        displayCustomerMenu();
                        break;
                    case 3:
                        displayFacilityMenu();
                        break;
                    case 4:
                        displayBookingMenu();
                        break;
                    case 5:
                        displayPromotionMenu();
                        break;
                    case 6:
                        System.out.println("Exiting the program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        } while (choice != 6);
}
    public void displayEmployeeMenu() {
        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Employee Management");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            try {
                switch (choice) {
                    case 1:
                        // Implement the logic to display employees

                        break;
                    case 2:
                        // Implement the logic to add a new employee
                        break;
                    case 3:
                        // Implement the logic to edit an employee
                        break;
                    case 4:
                        System.out.println("Returning to the main menu.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        } while (choice != 4);
    }

}
