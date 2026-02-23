import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Advance {
    public static void main(String[] args) {
        

        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in))
        );
        try {
            long t = Long.parseLong(br.readLine());
         
            for(int i = 0 ; i < t ; i++){
                   var input = br.readLine().trim().split(" ");
                long x = Long.parseLong(input[0]);
                long y = Long.parseLong(input[1]);
                System.out.println((x <= y && y <= x + 200) ? "YES" : "NO");
                


            }
            
        } catch (Exception e) {
           System.err.println(e.getMessage());
        }




    }
}
