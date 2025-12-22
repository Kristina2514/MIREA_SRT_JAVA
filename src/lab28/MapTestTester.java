package lab28;

public class MapTestTester {
    public static void main(String[] args) {
        MapTest mapTest = new MapTest();
        mapTest.createMap();

        System.out.println("Повторяющиеся имена: " + mapTest.getSameFirstNameCount());
        System.out.println("Повторяющиеся фамилии: " + mapTest.getSameLastNameCount());
    }
}
