package h3;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class H3_main {

    public static void main(String[] args) {

        int[][] einheiten = {
                {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        int input = RandomGenerator.getDefault().nextInt(1, 100_000);

        System.out.println("Input amount: " + input);

        for (int i = 0; i < einheiten[0].length; i++) {
            System.out.println("Now checking: " + einheiten[0][i]);
            while(einheiten[0][i] <= input){
                input -= einheiten[0][i];
                System.out.println("Subtracting " + einheiten[0][i] + " from input. New input: " + input);
                einheiten[1][i]++;
            }
        }

        System.out.println("Output: " + Arrays.toString(einheiten[1]));
        System.out.println("Input amount: " + input);

    }

}
