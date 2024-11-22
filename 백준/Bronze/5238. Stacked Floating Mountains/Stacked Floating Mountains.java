import java.util.Scanner;

public class Main {

    private static boolean solveFibbonacciSimple(int [] sequence) {
        int n = sequence.length;

        if (n == 1 || n == 2) {
            return true;
        }

        for (int i = 2; i < n; i++) {
            if (sequence[i] != sequence[i - 1] + sequence[i - 2]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int i = 0; i < numCases; i++)
        {
            int lengthOfSequence = sc.nextInt();

            int [] sequence = new int[lengthOfSequence];

            for(int j = 0; j < lengthOfSequence; j++) {
                sequence[j] = sc.nextInt();
            }

            if(solveFibbonacciSimple(sequence)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}

