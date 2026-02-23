import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Adascool {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            long t = Long.parseLong(br.readLine());

            while (t-- > 0) {
                String[] input = br.readLine().split(" ");
                long n = Long.parseLong(input[0]);
                long m = Long.parseLong(input[1]);

                System.out.println(m * n % 2 == 0 ? "YES" : "NO");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}