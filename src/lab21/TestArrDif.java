package lab21;

public class TestArrDif {
    public static void main(String[] args) {
        String[] strArr = {"A", "B"};
        ArrDif<String> strStorage = new ArrDif<>(strArr);

        Integer[] intArr = {1, 2};
        ArrDif<Integer> intStorage = new ArrDif<>(intArr);
    }
}
