package lab21;

public class TestArrElem {
    public static void main(String[] args) {
        String[] strings = {"Java", "Python", "C++"};
        String lang = ArrElem.getElement(strings, 1);
        System.out.println("Второй язык: " + lang);

        Integer[] numbers = {10, 20, 30, 40};
        Integer num = ArrElem.getElement(numbers, 2);
        System.out.println("Третье число: " + num);

        Character[] chars = {'A', 'B', 'C'};
        Character letter = ArrElem.getElement(chars, 0);
        System.out.println("Первая буква: " + letter);
    }
}
