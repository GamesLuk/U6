package p1;

import java.util.random.RandomGenerator;

public class P1_main {

    public static void main(String[] args) {

        int n = RandomGenerator.getDefault().nextInt(100);
        System.out.println("n = " + n);
        System.out.println("n^2 = " + squared(n));

    }

    public static int squared(int x) {
        x++;
        return x * x;
    }

}