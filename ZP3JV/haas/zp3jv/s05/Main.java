package haas.zp3jv.s05;

import java.util.Arrays;
import java.util.List;

/**
 * Created by AntoninHaas.
 */
public class Main {
    public static void main(String[] args) {
        //task1
        List list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List mapped = Scheme.map(list, o -> (Integer) o * 2);
        mapped.forEach(n -> System.out.print(n + " "));
        System.out.println();

        //task2
        class Even implements Condition {
            public boolean condition(Object o) {
                return (Integer) o % 2 == 0;
            }
        }
        List even1 = Scheme.filter(list, new Even());
        even1.forEach(n -> System.out.print(n + " "));
        System.out.println();
        List even2 = Scheme.filter(list, o -> (Integer) o % 2 == 0);
        even2.forEach(n -> System.out.print(n + " "));
        System.out.println();
        List even3 = Scheme.filter(list, new Condition() {
            public boolean condition(Object o) {
                return (Integer) o % 2 == 0;
            }
        });
        even3.forEach(n -> System.out.print(n + " "));
        System.out.println();

        //task3
        long startms;
        long endms;
        String output = "";

        startms = System.currentTimeMillis();
        output = repeatChar1('c', 100000);
        endms = System.currentTimeMillis();

        System.out.println("String: " + (endms - startms) + "ms");

        startms = System.currentTimeMillis();
        output = repeatChar2('c', 100000);
        endms = System.currentTimeMillis();

        System.out.println("StringBuilder: " + (endms - startms) + "ms");
    }

    private static String repeatChar1(char c, int n) {
        String out = "";

        for (int i = 0; i < n; i++) {
            out += c;
        }

        return out;
    }

    private static String repeatChar2(char c, int n) {
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < n; i++) {
            out.append(c);
        }

        return out.toString();
    }

}
