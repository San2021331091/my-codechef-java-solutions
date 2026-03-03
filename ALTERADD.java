import java.io.*;
import java.util.stream.Stream;

public class ALTERADD {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));

        try{
            long t = Long.parseLong(br.readLine());
            while (t-- > 0L){
                var input = Stream.of(br.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
                long a = input[0], b = input[1];
                pr.println((b - a - 2L) % 3 != 0 ? "YES" : "NO");
            }
            br.close();
            pr.flush();
            pr.close();
        }
        catch (Exception e){
            pr.println(e.getMessage());
        }
    }
}
