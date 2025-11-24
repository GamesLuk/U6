package p2;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class P2_main {

    public static void main(String[] args) {

        int[] numbers = {
                RandomGenerator.getDefault().nextInt(10),
                RandomGenerator.getDefault().nextInt(10),
                RandomGenerator.getDefault().nextInt(10),
                RandomGenerator.getDefault().nextInt(10),
                RandomGenerator.getDefault().nextInt(10)
        };
        int max;
        int minIndex;

        minIndex = -1;
        max = -9_999_999;

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i] || max == -9_999_999) {
                max = numbers[i];
                minIndex = i;
            }
        }

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Max: " + max);
        System.out.println("Min index: " + minIndex);

    }

}
