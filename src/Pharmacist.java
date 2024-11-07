public class Pharmacist extends PharmacyUser {
    public Pharmacist(String name, String userId) {
        super(name, userId, "Pharmacist");
    }

    public void restockMedication(Medication medication, int quantity) {
        medication.restock(quantity);
        System.out.println(quantity + " units of " + medication.getName() + " restocked.");
    }

    @Override
    public void performAction() {
        System.out.println(name + " is managing the pharmacy stock.");
    }
}
