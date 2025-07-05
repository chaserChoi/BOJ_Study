import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; ++t) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            boolean cando = false;
            
            for (int D = 0; D <= 100; ++D) {
                int avg = 15*A + 20*B + 25*C + 40*D;
                if (avg/100 >= 90) {
                    cando = true;
                    System.out.println(D);
                    break;
                }
            }
            
            if (!cando) 
                System.out.println("impossible");
        }
    }
}