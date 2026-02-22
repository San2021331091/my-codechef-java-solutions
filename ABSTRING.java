import java.util.Arrays;
import java.util.Scanner;

public class ABSTRING {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            long t = sc.nextLong();

            while (t-- > 0) {

                long n = sc.nextLong();
                sc.nextLine();
                String s = sc.nextLine();
                var v = new long[26];
                Arrays.fill(v, 0L);
                for (int p = 0; p < n; p++) {
                    ++v[s.charAt(p) - 'a'];
                }
                boolean possible = true;

                for(int p = 0 ; possible && p < 26 ; p++){
                    if(v[p] % 2 != 0){
                        possible = false;
                    }
                }

                System.out.println(possible ? "YES" : "NO");
            }

        }

    }
}