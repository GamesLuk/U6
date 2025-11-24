package h2;

import java.util.*;
import java.util.random.RandomGenerator;

public class H2_main {

    public static void main(String[] args) {



    }

    public static boolean pairwiseDifferent(int[] someNumbers) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < someNumbers.length; i++) {
            list.add(someNumbers[i]);
        }

        Set<Integer> set = new HashSet<>();
        set.addAll(list);

        return set.size() == list.size();
    }

}
