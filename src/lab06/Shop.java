package lab06;

public class Shop implements Printable {
    private String name;
    private String address;
    private String type;

    public Shop(String name, String address, String type) {
        this.name = name;
        this.address = address;
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println("Магазин: " + name);
        System.out.println("Адрес: " + address);
        System.out.println("Тип: " + type);
        System.out.println();
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getType() { return type; }

    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setType(String type) { this.type = type; }
}
