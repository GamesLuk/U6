package h1;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class H1_main {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {4, 3, 2, 1};
        int[] c = {2, 4, 6};
        int[] d = {6, 4, 9};

        System.out.println("a + b -> " + isMirrorArray(a, b));
        System.out.println("c + d -> " + isMirrorArray(c, d));
        System.out.println("a + c -> " + isMirrorArray(a, c));

    }

    public static boolean isMirrorArray(int[] a, int[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length / 2 + 1; i++) {
            if (a[i] != b[b.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}
