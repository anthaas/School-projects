package haas.zp3jv.s01;

import java.util.Random;

/**
 * @author Antonin Haas
 **/
public class Lecture01 {

    public static void main(String[] args) {
        int param = 6;
        task1(param);
        task2(param);
        task3(7);
        task4(100);
    }

    private static void task4(int limit) {
        boolean[] sieve = new boolean[limit];
        boolean isPrime = false;
        boolean notPrime = true;

        sieve[0] = sieve[1] = notPrime;
        for (int i = 2; i <= Math.sqrt(sieve.length); i++) {
            if (sieve[i] == notPrime) {
                continue;
            }
            for (int j = 2 * i; j < sieve.length; j += i) {
                sieve[j] = notPrime;
            }
        }

        System.out.println("Prvocisla:");
        int nextLine = 0;
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i] == isPrime) {
                System.out.print(i + " ");
                nextLine++;
                if (nextLine % 10 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println();
    }

    private static void task3(int len) {
        int[] array = new int[len];
        Random randomGen = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGen.nextInt(200) - 100;
        }
        int min = array[0];
        int max = array[0];

        System.out.print("Pole: ");
        for (int anArray : array) {

            if (anArray < min) {
                min = anArray;
            }
            if (anArray > max) {
                max = anArray;
            }

            System.out.print(anArray + " ");
        }
        System.out.println();
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println();
    }

    private static void task2(int len) {
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len * len; j++) {
                if (((j != 1) && ((((j - 6) % 5 == 0)) || ((i + j) % (len - 1)) == 2)) || (j == 1 && i == len)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void task1(int len) {
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len; j++) {
                if (j == len || i + j == len + 1 || i == len) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
