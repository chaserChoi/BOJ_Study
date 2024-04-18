import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[4];
        for(int i = 0; i < a.length; i++) a[i] = sc.nextInt();
        Arrays.sort(a);

        int total = 0;
        for(int i = 1; i < a.length; i++) total += a[i];
        total += 1;
        
        System.out.println(total);
        sc.close();
    }
}