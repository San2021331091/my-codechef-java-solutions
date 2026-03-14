import java.io.*;
import java.util.*;

public class AMPRO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));

        String line = br.readLine();
        if (line != null && !line.isEmpty()) {
            String[] words = line.trim().split("\\s+");
            for (int i = 0; i < words.length; i++) {
                char firstChar = words[i].charAt(0);
                if ('a' <= firstChar && firstChar <= 'z') {
                    firstChar = (char) (firstChar - 'a' + 'A');
                }

                if (i + 1 < words.length) {
                    pr.print(firstChar + ".");
                } else {

                    pr.print(firstChar + words[i].substring(1));
                }
            }
            pr.println();
        }

        br.close();
        pr.flush();
        pr.close();
    }
}