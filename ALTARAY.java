import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.Stream;

public class ALTARAY {
    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));
            int t = Integer.parseInt(br.readLine());
            while (t-- > 0){
                var input = Stream.of(br.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
                long n = input[0];
                var a = new int[(int)n];
                Arrays.fill(a,0);
                var input1 = Stream.of(br.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
                for(int p = 0 ; p<n ; p++){
                    long x = input1[p];
                    if(x < 0L){a[p] = -1;}
                    else if(x > 0L){a[p] = 1;}
                }
                var b = new long[(int)n];
                Arrays.fill(b,1L);
               for(int p = (int)(n-2L) ; p>= 0 ; p--){
                   if(a[p] * a[p + 1] == -1){b[p] = 1 + b[p + 1];}
                   else{b[p] = 1;}
               }

               Arrays.stream(b).forEach(it -> pr.print(it+" "));

               pr.println();
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

