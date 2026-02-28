import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class AIRLINES {
    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));
            long t = Long.parseLong(br.readLine());
            while (t-- > 0L){
                var input = Stream.of(br.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
                long x = input[0];
                long y = input[1];
                long z = input[2];
                pr.println((Math.min((10 * x), y))*z);
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

