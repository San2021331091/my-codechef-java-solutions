import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class AIANALYSE {
    public static void main(String [] args) {

       try {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));
           long c = Long.parseLong(br.readLine());
           pr.println(c<= 1000L ? "Yes" : "No");
           br.close();
           pr.flush();
           pr.close();
       }
       catch (Exception e){
           System.err.println(e.getMessage());
       }
    }
}
