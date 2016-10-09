package haas.zp3jv.s03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by AntoninHaas on 2.10.16.
 */
public class Filter {

    public static int[] odd(int[] foo) {
        int oddCtr = 0;
        int[] oddArr = new int[foo.length];

        for (int i : foo) {
            if ((i % 2) == 1) {
                oddArr[oddCtr++] = i;
            }
        }

        oddArr = Arrays.copyOfRange(oddArr, 0, oddCtr);
        return oddArr;
    }

    public static List<Object> odd(List<Object> foo) {
        List oddList = new ArrayList<>();

        foo.stream().filter(o -> o instanceof Integer).forEach(o -> {
            Integer i = (Integer) o;
            if (i % 2 == 1) {
                oddList.add(i);
            }
        });
        return oddList;
    }

    public static List<Integer> oddNumbers(List<Integer> foo) {

        return foo.stream().filter(i -> i % 2 == 1).collect(Collectors.toList());
    }
}
