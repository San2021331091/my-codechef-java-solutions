import java.io.*;
import java.util.*;

public class AIRHOCKEY {
    public static void main(String ... args) {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));
            long t = Long.parseLong(br.readLine());
            while(t-- > 0L){
                var input = Arrays.stream(br.readLine().trim().split("\\s+")).mapToLong(Long::parseLong).toArray();
                long a = input[0];
                long b = input[1];
                pr.println(7L - Math.max(a,b));
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
