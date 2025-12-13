package lab4.lab4_1;


class Airplane extends Vehicle {
    private double takeoffTime; // время взлета и посадки в часах

    public Airplane(String name, double speed, double costPerKm, double capacity, double takeoffTime) {
        super(name, speed, costPerKm, capacity);
        this.takeoffTime = takeoffTime;
    }

    @Override
    public double calculateTime(double distance) {
        // Учитываем время взлета и посадки
        return (distance / speed) + takeoffTime;
    }

    @Override
    public double calculateCost(double distance, double weight) {
        double baseCost = distance * costPerKm;
        // Авиаперевозки обычно дороже для тяжелых грузов
        return baseCost * (1 + weight / capacity * 0.5);
    }
}