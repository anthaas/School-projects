package haas.zp3jv.s03;

import java.util.List;

/**
 * Created by AntoninHaas on 2.10.16.
 */
public class Print {
    public static void print(int[] arr) {
        System.out.print("[ ");
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
        System.out.println("]");
    }

    public static void print(List<Object> objRes) {
        System.out.print("[ ");
        for (Object o : objRes) {
            System.out.print(o + " ");
        }
        System.out.println("]");
    }

    public static void printNumbers(List<Integer> intRes) {
        System.out.print("[ ");
        for (Integer i : intRes) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
}
