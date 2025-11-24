package h3;

import java.util.*;
import java.util.random.RandomGenerator;

public class H3_main {

    public static void main(String[] args) {

        int[][] x = {
                {0,0},
                {1,2},
                {1,3,2,4},
                {1,2,-3,-4},
                {1,2,3,-3, -4}
        };

        for (int i = 0; i < x.length; i++) {
            System.out.println("Row " + i + ": " + Arrays.toString(x[i]));
            System.out.println("Return value of 1: " + methode(x[i]));
            System.out.println("Return value of 2: " + methode1(x[i]));
            System.out.println("--------------------------------------------------");
        }

    }

    // Am Beispiel 1
    public static int methode(int[] a) {
        int max = -1;
        int k = a.length - 1;   // hier: 4
        for (int i = 0; i < k; i++) {   // hier: i = 0,1,2,3
            for (int j = 0; j < k; j++) {   // hier: (i, j) =
                // (0,0),(0,1),(0,2),(0,3),
                // (1,0),(1,1),(1,2),(1,3),
                // (2,0),(2,1),(2,2),(2,3),
                // (3,0),(3,1),(3,2),(3,3)
                if (a[j] > a[i]) {
                    max = a[j];
                }
            }
        }
        return max;
    }

    public static int methode1(int[] a) {
        List<Integer> list = new ArrayList<>();

        for (int value : a) {
            list.add(value);
        }

        list.sort(Integer::compareTo);
        System.out.println(list.toString());
        Set<Integer> set = new HashSet<>();

        for (int value : list) {
            set.add(Math.abs(value));
        }

        System.out.println(set.toString());

        int secondLargest;
        try {
            secondLargest = (int) set.toArray()[set.size() - 2];
        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }

        return list.contains(secondLargest) ? secondLargest : -secondLargest;
    }


}
