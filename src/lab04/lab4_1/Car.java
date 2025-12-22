package lab04.lab4_1;

class Car extends Vehicle { // Класс Машина наследуется от абстрактного класса
    private boolean isTruck; // является ли грузовиком

    public Car(String name, double speed, double costPerKm, double capacity, boolean isTruck) {
        super(name, speed, costPerKm, capacity); // конструктор родительского класса
        this.isTruck = isTruck;
    }

    @Override // метод переопределяет метод родительского класса
    public double calculateTime(double distance) {
        // Учитываем возможные пробки для автомобиля
        return distance / speed;
    }

    @Override
    public double calculateCost(double distance, double weight) {
        double baseCost = distance * costPerKm;
        if (weight > capacity) {
            System.out.println("Внимание: вес превышает вместимость автомобиля!");
            return baseCost * 2; // штраф за перегруз
        }
        return baseCost;
    }

}
