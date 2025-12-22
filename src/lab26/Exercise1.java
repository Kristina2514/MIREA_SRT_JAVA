package lab26;

import java.util.Arrays;
import java.util.Stack;

public class Exercise1 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println("Исходный массив: " + Arrays.toString(array));

        Stack<Integer> stack = new Stack<>();
        for (Integer num : array) {
            stack.push(num);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        System.out.println("Инвертированный массив " + Arrays.toString(array));
    }
}
