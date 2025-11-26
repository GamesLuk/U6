package h3;

import java.util.*;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class H3_main {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};
        int[] c = {1, 3, 2};
        int[] d = {1, 2};
        int[] e = {1, 2, 3};
        int[] f = {1, 1, 2};

        System.out.println("a + b -> " + compareArraysVal(a, b));
        System.out.println("c + e -> " + compareArraysVal(c, e));
        System.out.println("a + e -> " + compareArraysVal(a, e));
    }

    public static boolean compareArraysVal(int[] a, int[] b) {
        if (a.length != b.length) return false;

        List<Integer> listA = new ArrayList<>(Arrays.stream(a).boxed().toList());
        List<Integer> listB = new ArrayList<>(Arrays.stream(b).boxed().toList());

        for (Integer value : listA) {
            if (!listB.contains(value)) {
                return false;
            } else {
                listB.remove(value);
            }
        }
        return true;
    }


}
