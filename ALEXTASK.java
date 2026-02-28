import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.Stream;

public class ALEXTASK {

    private static long gcd(long a, long b){
        return (b==0L) ? a : gcd(b,a%b);
    }
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));
        try {

            int t = Integer.parseInt(br.readLine());
            while (t-- > 0L){
                var input = Stream.of(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                int n = input[0];
                long[] a = new long[n];
                Arrays.fill(a,0L);
                var input1 = Stream.of(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                for(int p = 0 ; p < n ; p++) {
                    a[p] = input1[p];

                }
                long res = (long)5e18;
                for(int x = 0 ; x<n ; x++){
                    for(int y = x+1;y<n;y++){
                        long lcm = (a[x] / gcd(a[x],a[y])) * a[y];
                        res = Math.min(res,lcm);
                    }
                }
                pr.println(res);

            }

            br.close();
            pr.flush();
            pr.close();
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
