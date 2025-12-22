package lab04.lab4_1;

abstract class Vehicle {
    protected String name;
    protected double speed; // км/ч
    protected double costPerKm; // стоимость за км
    protected double capacity; // грузоподъемность в тоннах

    public Vehicle(String name, double speed, double costPerKm, double capacity)
    {
        this.name = name;
        this.speed = speed;
        this.costPerKm = costPerKm;
        this.capacity = capacity;
    }

    public abstract double calculateTime(double distance);
    public abstract double calculateCost(double distance, double weight);

    public void displayInfo() {
        System.out.println("Транспорт: " + name);
        System.out.println("Скорость: " + speed + " км/ч");
        System.out.println("Вместимость: " + capacity + " тонн");
    }

}
