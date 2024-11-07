import java.util.Scanner;

public class Main {
    private static final Pharmacy pharmacy = new Pharmacy();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize the pharmacy with some medications
        initializePharmacy();
        
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> searchMedication();
                case 2 -> viewStock();
                case 3 -> orderMedication();
                case 4 -> {
                    System.out.println("Exiting...");
                    return; // Exit the program
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to display the main menu
    private static void displayMenu() {
        System.out.println("\n==== e-Pharmacy Management System ====");
        System.out.println("1. Search for Medication");
        System.out.println("2. View Pharmacy Stock");
        System.out.println("3. Order Medication");
        System.out.println("4. Exit");
        System.out.print("Please select an option: ");
    }

    // Method to search for medications
    private static void searchMedication() {
        System.out.print("\nEnter medication name or manufacturer to search: ");
        String keyword = scanner.nextLine();
        pharmacy.search(keyword);

        // Allow user to order after searching
        orderOptionAfterSearch();
    }

    // After search, prompt user if they want to order
    private static void orderOptionAfterSearch() {
        System.out.print("Would you like to order any of the medications (yes/no)? ");
        String orderChoice = scanner.nextLine();
        
        if (orderChoice.equalsIgnoreCase("yes")) {
            orderMedication();
        }
    }

    // Method to view the pharmacy's stock
    private static void viewStock() {
        System.out.println("\n==== Pharmacy Stock ====");
        System.out.printf("%-20s%-20s%-15s%-15s%-15s%-10s%n", "Name", "Manufacturer", "Expiry Date", "Batch No.", "Stock Quantity", "Price");
        for (Medication med : pharmacy.getMedications()) {
            System.out.printf("%-20s%-20s%-15s%-15s%-15d%-10.2f%n", med.getName(), med.getManufacturer(), med.getExpiryDate(), med.getBatchNumber(), med.getStockQuantity(), med.getPrice());
        }
    }

    // Method to order a medication
    private static void orderMedication() {
        System.out.print("\nEnter the name of the medication you want to order: ");
        String medicationName = scanner.nextLine();
        
        Medication selectedMedication = findMedicationByName(medicationName);
        if (selectedMedication != null) {
            System.out.print("Enter quantity to order: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            Customer customer = new Customer("John Doe", "C001", 100.0); // Create customer with a balance of 100.0
            customer.purchaseMedication(selectedMedication, quantity);
            showTotalBill(selectedMedication, quantity);
        } else {
            System.out.println("Medication not found in the pharmacy.");
        }
    }

    // Find a medication by its name
    private static Medication findMedicationByName(String medicationName) {
        for (Medication med : pharmacy.getMedications()) {
            if (med.getName().equalsIgnoreCase(medicationName)) {
                return med;
            }
        }
        return null;
    }

    // Show total bill after purchase
    private static void showTotalBill(Medication medication, int quantity) {
        double totalCost = medication.getPrice() * quantity;
        System.out.println("\nTotal Bill:");
        System.out.println("Medication: " + medication.getName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalCost);
        
        // Ask user if they want to order more or exit
        System.out.print("\nWould you like to order another medication (yes/no)? ");
        String continueChoice = scanner.nextLine();
        
        if (continueChoice.equalsIgnoreCase("yes")) {
            orderMedication();
        } else {
            System.out.println("Thank you for your purchase. Exiting...");
        }
    }

    // Initialize pharmacy with some medications
    private static void initializePharmacy() {
        Medication med1 = new Medication("Paracetamol", "XYZ Pharma", "2025-12-01", "12345", 100, 5.0);
        Medication med2 = new Medication("Aspirin", "ABC Pharma", "2024-12-01", "67890", 50, 7.0);
        Medication med3 = new Medication("Ibuprofen", "DEF Pharma", "2023-06-01", "11223", 200, 3.5);
        Medication med4 = new Medication("Amoxicillin", "GHI Pharma", "2026-05-01", "44556", 150, 8.0);
        Medication med5 = new Medication("Cough Syrup", "JKL Pharma", "2024-01-01", "78901", 80, 4.0);
        
        pharmacy.addMedication(med1);
        pharmacy.addMedication(med2);
        pharmacy.addMedication(med3);
        pharmacy.addMedication(med4);
        pharmacy.addMedication(med5);
    }
}
