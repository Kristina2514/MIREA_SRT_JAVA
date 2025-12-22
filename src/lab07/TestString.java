package lab07;

public class TestString {
    public static void main(String[] args) {
        StringFunc strOpp = new ProcessString();
        String s = "Hello world";
        System.out.println("Подсчёт кол-ва символов в строке: " + strOpp.cLetters(s));
        System.out.println("Нечетные элементы строки: " + strOpp.NechetLetters(s));
        System.out.println("Инвертированная строка: " + strOpp.reverseLetters(s));
    }
}
