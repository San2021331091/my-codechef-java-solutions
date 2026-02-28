import java.io.*;
import java.util.stream.Stream;

public class AIRLINE {
    public static void main(String [] args) {
         try{
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));
             long t = Long.parseLong(br.readLine());
             while (t-- > 0L){
                 var input = Stream.of(br.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
                 long a = input[0];
                 long b = input[1];
                 long c = input[2];
                 long d = input[3];
                 long e = input[4];

                 boolean possible = (a + b <= d && c <= e) || (a + c <= d && b <= e) || (b + c <= d && a <= e) ;
                 pr.println(possible ? "YES" : "NO");

             }
             br.close();
             pr.flush();
             pr.close();

         }
         catch (IOException e){
             System.err.println(e.getMessage());
         }


    }
}
