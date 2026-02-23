import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Adjhate {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            int t = Integer.parseInt(br.readLine().trim());

            for (int i = 0; i < t; i++) {

                int n = Integer.parseInt(br.readLine().trim());

                List<Long> odds = new ArrayList<>();
                List<Long> evens = new ArrayList<>();

                String[] input = br.readLine().trim().split(" ");

                for (int p = 0; p < n; p++) {
                    long x = Long.parseLong(input[p]);

                    if (x % 2 == 0) {
                        evens.add(x);
                    } else {
                        odds.add(x);
                    }
                }

                if (odds.isEmpty() || evens.isEmpty()) {
                    System.out.println("-1");
                } else {
                    for (Long o : odds)
                        System.out.print(o + " ");

                    for (Long e : evens)
                        System.out.print(e + " ");

                    System.out.println();
                }
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}