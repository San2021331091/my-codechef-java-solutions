import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class ALPHABET {
    public static final int N = 26;
    public static void main(String ... args) {
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));
            String a = br.readLine();
            boolean [] v = new boolean[N];
            Arrays.fill(v,false);
            for(int p : a.toCharArray()){
                v[a.charAt(p) - 'a'] = false;
            }
            int t = Integer.parseInt(br.readLine());
            var input = br.readLine().split("\\s+");
            for (int i = 0 ; i<t; i++){
                String u = input[i];
                boolean possible = true;
                for(int p = 0 ; p < u.length();p++){
                    if(!v[u.charAt(p) - 'a']){
                        possible = false;
                        break;
                    }
                }
                pr.println(possible ? "Yes" : "No");

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

