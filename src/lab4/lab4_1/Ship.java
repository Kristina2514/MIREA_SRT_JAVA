package lab4.lab4_1;

class Ship extends Vehicle {
    private boolean isCargoShip; // является ли грузовым кораблем

    public Ship(String name, double speed, double costPerKm, double capacity, boolean isCargoShip) {
        super(name, speed, costPerKm, capacity);
        this.isCargoShip = isCargoShip;
    }

    @Override
    public double calculateTime(double distance) {
        // Корабли самые медленные
        return distance / (speed * 0.9);
    }

    @Override
    public double calculateCost(double distance, double weight) {
        double baseCost = distance * costPerKm;
        // Морские перевозки самые дешевые для больших грузов
        if (isCargoShip && weight > 10) {
            return baseCost * 0.7; // большая скидка для грузовых кораблей
        }
        return baseCost;
    }
}
