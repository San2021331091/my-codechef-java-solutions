import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class ALTER {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));
        try{
            long t = Long.parseLong(br.readLine());
              while (t-- > 0L){
                  var input = Stream.of(br.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
                  long A = input[0],B = input[1],P=input[2],Q=input[3];
                  if((P % A) != 0 || (Q % B) != 0){
                      pr.println("NO");
                      continue;
                  }
                  P /= A;
                  Q /=B;
                  if((P == Q) || (P== Q-1) || (P==Q+1)){
                      pr.println("YES");
                  }

                  else{
                      pr.println("NO");
                  }
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
