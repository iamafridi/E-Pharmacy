public class Medication {
    private final String name;
    private final String manufacturer;
    private final String expiryDate;
    private final String batchNumber;
    private int stockQuantity;
    private final double price;

    public Medication(String name, String manufacturer, String expiryDate, String batchNumber, int stockQuantity, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.batchNumber = batchNumber;
        this.stockQuantity = stockQuantity;
        this.price = price;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public double getPrice() {
        return price;
    }

    // Methods to update stock
    public void purchase(int quantity) throws InsufficientStockException {
        if (quantity > stockQuantity) {
            throw new InsufficientStockException("Not enough stock for " + name);
        }
        stockQuantity -= quantity;
    }

    public void restock(int quantity) {
        stockQuantity += quantity;
    }

    @Override
    public String toString() {
        return "Medication[name=" + name + ", manufacturer=" + manufacturer + ", expiryDate=" + expiryDate + ", batchNumber=" + batchNumber + ", stockQuantity=" + stockQuantity + ", price=" + price + "]";
    }
}
