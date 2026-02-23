import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class AIAnalysis {
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        
        try {
            long c = Long.parseLong(br.readLine().trim());
          
            pr.println(c <= 1000 ? "Yes" : "No");
            br.close();
            pr.close();
            
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }



    }
}
