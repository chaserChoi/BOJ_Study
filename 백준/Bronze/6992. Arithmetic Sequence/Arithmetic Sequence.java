import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Integer> solveArithmeticSequence(ArrayList<Integer> sequence) {

        ArrayList<Integer> answer = new ArrayList<Integer>();

        int commonDiff = sequence.get(1) - sequence.get(0);
        boolean isArithmetic = true;

        for (int i = 2; i < sequence.size(); i++) {
            if (sequence.get(i) - sequence.get(i - 1) != commonDiff) {
                isArithmetic = false;
                break;
            }
        }

        if (isArithmetic) {
            int lastNum = sequence.get(sequence.size() - 1);
            for (int i = 1; i <= 5; i++) {
                lastNum += commonDiff;
                answer.add(lastNum);
            }
        } else
            answer = null;

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int n = 0; n < numCases; n++) {
            int numLength = sc.nextInt();

            ArrayList<Integer> sequence = new ArrayList<Integer>();

            for(int i = 0; i < numLength; i++)
                sequence.add(sc.nextInt());

            ArrayList<Integer> answer = solveArithmeticSequence(sequence);

            if(answer == null) {
                System.out.println("The sequence " + sequence + " is not an arithmetic sequence.");
            } else {
                System.out.println("The next 5 numbers after " + sequence + " are: " + answer);
            }
        }

        sc.close();
    }
}
