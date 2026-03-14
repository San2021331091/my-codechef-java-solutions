import java.util.Scanner;

public class AMR15A {

    @FunctionalInterface
    interface AMR {
        String solve();
    }

    static class AMRSolver {
        static String makeSolution() {
            var sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            int ready = 0;
            while (n-- > 0) {
                int a = sc.nextInt();
                ready += (a % 2 == 1) ? (-1) : 1;
            }

            return (ready > 0) ? "READY FOR BATTLE" : "NOT READY";
        }
    }


    public static void main(String[] args) {

        AMR amr = AMRSolver::makeSolution;
        System.out.println(amr.solve());


    }
}
