import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Adastair {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));

        try {

            long t = Long.parseLong(br.readLine());

            while (t-- > 0L) {

                String[] input = br.readLine().split(" ");
                long n = Long.parseLong(input[0]);
                long k = Long.parseLong(input[1]);
                long cur = 0L, cnt = 0L;
                String [] input1 = br.readLine().split(" ");

                for (int i = 0; i < n; i++) {
                    long h = Long.parseLong(input1[i]);
                    cnt += (h - cur - 1L) / k;
                    cur = h;
                }
                System.out.println(cnt);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
