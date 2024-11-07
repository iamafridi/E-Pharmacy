public class Customer extends PharmacyUser {
    private double balance;

    public Customer(String name, String userId, double balance) {
        super(name, userId, "Customer");
        this.balance = balance;
    }

    public void purchaseMedication(Medication medication, int quantity) {
        try {
            medication.purchase(quantity);
            double totalCost = medication.getPrice() * quantity;
            if (balance >= totalCost) {
                balance -= totalCost;
                System.out.println("Purchased " + quantity + " " + medication.getName() + "(s). Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient balance to complete the purchase.");
            }
        } catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void performAction() {
        System.out.println(name + " is browsing medications.");
    }
}
