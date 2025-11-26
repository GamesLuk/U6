package h2;

public class H2_main {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};
        int[] c = {1, 3, 2};
        int[] d = {1, 2};
        int[] e = {1, 2, 3};

        System.out.println("a + b -> " + compareArrays(a, b));
        System.out.println("c + d -> " + compareArrays(c, d));
        System.out.println("a + e -> " + compareArrays(a, e));
    }

    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

}
