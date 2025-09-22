package lab2;

public class Computer {
    private String brand;
    private double price;
    private int storage;

    public Computer(String brand, double price, int storage) {
        this.brand = brand;
        this.price = price;
        this.storage = storage;
    }

    public String getBrand() { return brand; }
    public double getPrice() { return price; }
    public int getStorage() { return storage; }

    public String toString() {
        return String.format("%s | Память: %dGB | Цена: $%.2f",
                brand, storage, price);
    }

    public boolean matches(String brand, Integer maxPrice, Integer minStorage) {
        if (brand != null && !brand.isEmpty() && !this.brand.equalsIgnoreCase(brand)) {
            return false;
        }
        if (maxPrice != null && this.price > maxPrice) {
            return false;
        }
        if (minStorage != null && this.storage < minStorage) {
            return false;
        }
        return true;
    }
}