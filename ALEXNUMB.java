import java.io.*;

public class ALEXNUMB {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            br.readLine(); 
            pr.println(n * (n - 1) / 2);
        }
        br.close();
        pr.flush();
        pr.close();
    }
}