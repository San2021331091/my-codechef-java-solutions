import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class AMMEAT {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));

        try {

            long t = Long.parseLong(br.readLine());
            while (t-- > 0L){
                var line = Arrays.stream(br.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
                long n = line[0], m = line[1];
                var a = new LinkedList<>(Collections.nCopies((int)n,0L));

                var line1 = Arrays.stream(br.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();

                for (int p = 0; p <n ; p++){
                   a.add(line1[p]);
                }
                a.sort(Collections.reverseOrder());
                long s = 0L , res = 0L;
                for(int p = 0; p < n; p++){
                    s += a.get(p);
                    if(s >= m)
                    {
                        res = p + 1;
                        break;
                    }}

                pr.println((s >= m) ? res : -1L);
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
