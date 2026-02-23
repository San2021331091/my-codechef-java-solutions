import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Adigit {

    private static int IAbs(int x) {
        return (x >= 0) ? x : -x;
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        final int D = 10;
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        try {
            String[] input = br.readLine().split(" ");
            long n = Long.parseLong(input[0]);
            long m = Long.parseLong(input[1]);

            String s = br.readLine();

            List<Integer> count = new ArrayList<>(Collections.nCopies(D, 0));

            List<Integer> v = new ArrayList<>(Collections.nCopies(s.length(), 0));

            for (int p = 0; p < s.length(); p++) {
                int digit = s.charAt(p) - '0';

                count.set(digit, count.get(digit) + 1);

                int total = 0;
                for (int d = 0; d < D; d++) {
                    total += count.get(d) * IAbs(digit - d);
                }

                v.set(p, total);
            }

            for (int i = 0; i < m; i++) {

                String line = br.readLine();

                long x = Long.parseLong(line.trim());

                int index = (int) x - 1;

                if (index >= 0 && index < v.size()) {
                    System.out.println(v.get(index));
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}