import java.io.*;
import java.util.StringTokenizer;

public class ALTSTR {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));

        try {
            long t = Long.parseLong(br.readLine());
            while (t-- > 0L) {
                StringTokenizer tokenizer = new StringTokenizer(br.readLine().trim());
                long n = Long.parseLong(tokenizer.nextToken());
                String s = tokenizer.nextToken();

                long z = 0L, a = 0L;
                for (int p = 0; p < n; p++) {
                    z += (s.charAt(p) == '0') ? 1L : 0L;
                    a += (s.charAt(p) == '1') ? 1L : 0L;
                }

                long mn = Math.min(a, z);
                long mx = Math.max(a, z);
                pr.println(2L * mn + ((mn < mx) ? 1L : 0L));
            }

            pr.flush();
            br.close();
            pr.close();

        } catch (Exception e) {
            pr.println(e.getMessage());
        }
    }
}