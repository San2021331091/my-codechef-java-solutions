import java.io.*;
import java.util.StringTokenizer;

public class AMMEAT2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));

        int tCases = Integer.parseInt(br.readLine().trim());
        int upperLimit , numPlates;
        while (tCases -- > 0){
            var tokenizer = new StringTokenizer(br.readLine().trim());
            upperLimit = Integer.parseInt(tokenizer.nextToken());
            numPlates = Integer.parseInt(tokenizer.nextToken());
            if(upperLimit == 1 && numPlates == 1){
                pr.print("1");
            }
            else if(numPlates > upperLimit / 2){
                pr.print("-1");
            }
            else{
                for(int k = 1; k <= numPlates; k++){
                pr.print((2 * k)+" ");
            }}
            pr.println();
        }

        br.close();
        pr.flush();
        pr.close();
    }
}
