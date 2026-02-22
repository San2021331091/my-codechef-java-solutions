import java.util.Scanner;

public class Accuracy {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            long t = sc.nextLong();

            sc.nextLine(); 
         

            while(t-- > 0){
                long x = sc.nextLong();
                System.out.println((3 - x% 3) % 3);
            }
        }




    }
}
