package p1;

public class P1_main {

    public static void main(String[] args) {

        int x = 0;
        while(x <= 10) {
            x = x + 1;
            System.out.print(x);
        }

        System.out.println("------------");

        for (int i = 0; i <= 10; ) {
            i++;
            System.out.print(i);
        }

        System.out.println("------------");

        int j = 0;
        do {
            j++;
            System.out.print(j);
        } while (j <= 10);

    }

}