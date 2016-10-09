package haas.zp3jv.s03;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AntoninHaas on 2.10.16.
 */
public class Sort {

    static int[] merge(int[] a, int[] b) {
        int n = a.length + b.length;
        int[] merged = new int[n];
        for (int i = 0, ai = 0, bi = 0; i < n; i++) {
            if ((bi >= b.length) || ((ai < a.length) && (a[ai] < b[bi]))) {
                merged[i] = a[ai];
                ai++;
            } else {
                merged[i] = b[bi];
                bi++;
            }
        }
        return merged;
    }

    static List<Integer> merge(List<Integer> a, List<Integer> b) {
        List<Integer> merged = new ArrayList<>();
        int len = a.size() + b.size();

        for (int i = 0, ai = 0, bi = 0; i < len; i++) {
            if ((bi >= b.size()) || ((ai < a.size()) && (a.get(ai) < b.get(bi)))) {
                merged.add(a.get(ai));
                ai++;
            } else {
                merged.add(b.get(bi));
                bi++;
            }
        }
        return merged;
    }

    static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() > 1) {
            int q = list.size() / 2;
            List<Integer> l = new ArrayList<>(list.subList(0, q));
            List<Integer> r = new ArrayList<>(list.subList(q, list.size()));

            return merge(mergeSort(l), mergeSort(r));
        }
        return list;
    }
}
