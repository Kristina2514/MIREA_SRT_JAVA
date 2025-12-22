package lab03;

public class DoubleWrapped {
    public static void main(String[] args) {
        //Создание объектов класса Double, используя метод valueOf()
        Double n1 = Double.valueOf(2.43);
        Double n2 = Double.valueOf("2.56");
        System.out.println("Элементы, переведенные в Double: " + n1 + ", " + n2);

        //Преобразование String к типу double с помощью метода Double.parseDouble()
        String n3 = "1.65";
        Double n3_new = Double.parseDouble(n3);
        System.out.println("Элемент n3 переведен в Double: " + n3_new);

        //Преобразование объекта класса ко всем примитивным типам
        Double n4 = 123.4567;
        byte n4_b = n4.byteValue();
        short n4_sh = n4.shortValue();
        int n4_i = n4.intValue();
        long n4_l = n4.longValue();
        float n4_f = n4.floatValue();
        double n4_d = n4.doubleValue();

        System.out.println("byte: " + n4_b);
        System.out.println("short: " + n4_sh);
        System.out.println("int: " + n4_i);
        System.out.println("long: " + n4_l);
        System.out.println("float: " + n4_f);
        System.out.println("double: " + n4_d);

        //Преобразование литерала к строке
        String n5 = Double.toString(3.14);
        System.out.println("string: " + n5);
        System.out.println("Тип переменной: " + n5.getClass().getSimpleName());

    }
}
