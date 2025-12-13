package lab13;

public class stringJava {
    public static void stringJava(String str) {
        System.out.println("Исходная строчка: " + str);

        char lastch = str.charAt(str.length()-1);
        System.out.println("Последний символ: " + lastch);

        boolean f1 = str.endsWith("!!!");
        if (f1) {
            System.out.println("Строка заканчивается на !!!.");
        }

        boolean f2 = str.startsWith("I like");
        if (f2) {
            System.out.println("Строка начинается с I like.");
        }

        boolean f3 = str.contains("Java");
        if (f3) {
            System.out.println("Строка содержит в себе Java.");
        }

        int pos = str.indexOf("Java");
        System.out.println("Позиция в строке слова Java: " + pos);

        String replS = str.replace("a", "o");
        System.out.println("Строчка после замены букв: " + replS);

        String upp = str.toUpperCase();
        System.out.println(upp);

        String lowr = str.toLowerCase();
        System.out.println(lowr);

        if (pos != -1) {
            String st = str.substring(pos, pos + 4);
            System.out.println("Вырезанная строчка: " + st);
        }
    }

    public static void main(String[] args) {
        String test = "I like Java!!!";
        stringJava(test);
    }
}
