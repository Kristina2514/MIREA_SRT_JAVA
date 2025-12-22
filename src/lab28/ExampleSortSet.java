package lab28;

import java.util.*;

public class ExampleSortSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("geeks");
        set.add("practice");
        set.add("contribute");
        set.add("ide");
        System.out.println("Original HashSet: " + set);
        TreeSet<String> set1 = new TreeSet<>(set);
        System.out.println("Sort HashSet: " + set1);
    }
}
