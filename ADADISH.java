import java.util.Arrays;
import java.util.Scanner;

public class ADADISH {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            long t = sc.nextLong();

            sc.nextLine();

            while (t-- > 0) {

                long n = sc.nextLong();
                long[] a = new long[(int) n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong();
                }
                Arrays.sort(a);
                long res = 0L;
                switch ((int) n) {
                    case 1 -> {
                        res = a[0];
                    }
                    case 2 -> {
                        res = a[1];
                    }
                    case 3 -> {
                        long u = a[0] + a[1];
                        long v = a[2];
                        res = (u > v) ? u : v;
                    }
                    case 4 -> {
                        long u = a[0] + a[3];
                        long v = a[1] + a[2];
                        res = (u > v) ? u : v;

                        u = a[0] + a[1] + a[2];
                        v = a[3];
                        long w = (u > v) ? u : v;
                        res = (res < w) ? res : w;
                    }
                }
                  System.out.println(res);
            }
          
        }

    }
}
