import java.util.Scanner;

public class Main {
    private static String findLongestDecreasigSuffix(String s) {
        int pos = 0;
        for(int i = s.length() - 1; i >= 1; i--) {
            if(s.charAt(i) > s.charAt(i-1)) {
                pos = i;
                break;
            }
        }

        return s.substring(pos);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int i = 0; i < numCases; i++)
        {
            String s = sc.next();
            System.out.println("The longest decreasing suffix of " + s + " is " + findLongestDecreasigSuffix(s));
        }
    }
}
