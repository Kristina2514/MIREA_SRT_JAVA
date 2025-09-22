package lab3;

import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class RandomDouble {
    public static void main(String[] args) {
        ArrayList<Double> lst1 = new ArrayList<>();
        ArrayList<Double> lst2 = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            double rand_int1 = rand.nextDouble(100);
            lst1.add(rand_int1);
        }

        System.out.println("Lst1 до сортировки - " + lst1);
        Collections.sort(lst1);
        System.out.println("Lst1 после сортировки - " + lst1);

        for (int i = 0; i < 100; i++) {
            Double x = Math.random()*100;
            lst2.add(x);
        }

        System.out.println();
        System.out.println("List2 до сортировки - " + lst2);
        Collections.sort(lst2);
        System.out.println("List2 после сортировки - " + lst2);
    }
}