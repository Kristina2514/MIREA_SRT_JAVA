package lab4.lab4_1;

class Train extends Vehicle {
    private int numberOfWagons; // количество вагонов

    public Train(String name, double speed, double costPerKm, double capacity, int numberOfWagons) {
        super(name, speed, costPerKm, capacity);
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public double calculateCost(double distance, double weight) {
        double baseCost = distance * costPerKm;
        // Поезда эффективны для больших грузов
        return baseCost;
    }
}
