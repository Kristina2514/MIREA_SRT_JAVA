package lab04.lab4_1;

class Veh_Test {
    public static void main(String[] args) {
        // Создаем различные транспортные средства
        Vehicle[] vehicles = {
                new Car("Грузовик", 80, 50, 20, true),
                new Airplane("Boeing", 800, 200, 50, 1.5),
                new Train("Грузовой поезд", 100, 30, 500, 20),
                new Ship("Грузовое судно", 40, 15, 1000, true)
        };

        double distance = 1000; // расстояние в км
        double weight = 30; // вес груза в тоннах

        System.out.println("Расчет перевозки на расстояние " + distance + " км, вес " + weight + " тонн:\n");

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.name);
            vehicle.displayInfo();
            double time = vehicle.calculateTime(distance);
            double cost = vehicle.calculateCost(distance, weight);

            System.out.printf("Время в пути: %.2f часов\n", time);
            System.out.printf("Стоимость перевозки: %.2f $\n", cost);
            System.out.println();
        }
    }
}