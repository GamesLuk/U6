package p2;

import java.util.*;
import java.util.random.RandomGenerator;

public class P2_main {

    public static void main(String[] args) {

        int[] x = RandomGenerator.getDefault().ints(5, 0, 20).toArray();
        int[] y = RandomGenerator.getDefault().ints(5, 0, 20).toArray();

        System.out.println("x = " + Arrays.toString(x));
        System.out.println("x -> " + pairwiseDifferent(x));
        System.out.println("y = " + Arrays.toString(y));
        System.out.println("y -> " + pairwiseDifferent(y));

    }

    public static boolean pairwiseDifferent(int[] someNumbers) {
        List<Integer> list = new ArrayList<>();

        for (int someNumber : someNumbers) {
            list.add(someNumber);
        }

        Set<Integer> set = new HashSet<>(list);

        return set.size() == list.size();
    }

}
