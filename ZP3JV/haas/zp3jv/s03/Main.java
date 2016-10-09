package haas.zp3jv.s03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by AntoninHaas.
 */
public class Main {
    public static void main(String[] args) {

        int[] arr = new int[20];
        List<Object> objArr = new ArrayList<>();
        List<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arr[i] = i;
            objArr.add(i);
            intArr.add(i);
        }
        objArr.add("object");
        objArr.add(1.25);

        //task1
        int[] res = Filter.odd(arr);
        System.out.println("Filter int[]: ");
        Print.print(arr);
        Print.print(res);
        System.out.println();

        //task2
        List<Object> objRes = Filter.odd(objArr);
        System.out.println("Filter List<Object>: ");
        Print.print(objArr);
        Print.print(objRes);
        System.out.println();

        //task3
        List<Integer> intRes = Filter.oddNumbers(intArr);
        System.out.println("Filter List<Integer>: ");
        Print.printNumbers(intArr);
        Print.printNumbers(intRes);
        System.out.println();

        //task4
        Point p = new Point(1, 1);
        List<Point> PointList = new ArrayList<>();
        PointList.add(new Point(2, 2));
        PointList.add(new Point(2, 3));
        PointList.add(new Point(3, 2));
        PointList.add(new Point(3, 3));
        Point nearest = Point.nearest(p, PointList);
        System.out.print("Nearest point to [1,1]: ");
        Point.printPoint(nearest);
        System.out.println();

        //task 5 and 6
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            l.add(i);
        }
        Collections.reverse(l);
        System.out.print("List: ");
        Print.printNumbers(l);
        List<Integer> sorted = Sort.mergeSort(l);
        System.out.print("Sorted: ");
        Print.printNumbers(sorted);


    }


}
