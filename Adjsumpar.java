import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Adjsumpar {
    public static void main(String[] args) {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            long t = Long.parseLong(br.readLine().trim());
            for (int i = 0; i < t; i++) {

                long n = Long.parseLong(br.readLine().trim());
                int s = 0;

                String inp1[] = br.readLine().trim().split(" ");
                for (int p = 0; p < n; p++) {

                    int x = Integer.parseInt(inp1[p]);
                    s ^= x;
                }

                System.out.println(s == 0 ? "YES" : "NO");

            }

        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }

    }
}
