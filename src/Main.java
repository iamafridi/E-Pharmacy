public class Main {
    public static void main(String[] args) {
        // Create a pharmacy
        Pharmacy pharmacy = new Pharmacy();

        // Create medications
        Medication med1 = new Medication("Paracetamol", "XYZ Pharma", "2025-12-01", "12345", 100, 5.0);
        Medication med2 = new Medication("Aspirin", "ABC Pharma", "2024-12-01", "67890", 50, 7.0);

        // Add medications to the pharmacy
        pharmacy.addMedication(med1);
        pharmacy.addMedication(med2);

        // Create users
        Customer customer = new Customer("John Doe", "C001", 100.0);
        Pharmacist pharmacist = new Pharmacist("Alice Smith", "P001");

        // Customer searches for medication
        customer.performAction();
        pharmacy.search("Aspirin");

        // Pharmacist restocks medication
        pharmacist.performAction();
        pharmacist.restockMedication(med1, 50);

        // Customer buys medication
        customer.purchaseMedication(med1, 20);

        // Sort medications
        pharmacy.sortMedications();

        // Print all medications
        System.out.println("\nAll medications in the pharmacy:");
        for (Medication med : pharmacy.getMedications()) {
            System.out.println(med);
        }
    }
}
