import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class AGEING {
    public static void main(String ... args) {

       try {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));
           long t = Long.parseLong(br.readLine());
           while (t-- > 0L) {
               var input = Arrays.stream(br.readLine().trim().split("\\s+")).mapToLong(Long::parseLong).toArray();
               long x = input[0];
               pr.println(x - 10L);
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
