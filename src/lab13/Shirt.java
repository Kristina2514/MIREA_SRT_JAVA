package lab13;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String shirtData) {
        String[] parts = shirtData.split(",");
        if (parts.length == 4) {
            this.id = parts[0].trim();
            this.name = parts[1].trim();
            this.color = parts[2].trim();
            this.size = parts[3].trim();
        }
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getColor() { return color; }
    public String getSize() { return size; }

    @Override
    public String toString() {
        return "Информация о рубашке:\n" +
                "  Артикул: " + id + "\n" +
                "  Название: " + name + "\n" +
                "  Цвет: " + color + "\n" +
                "  Размер: " + size;
    }
}
