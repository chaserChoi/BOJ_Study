import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] burger = new int[2];

        for(int i = 0; i <= st.countTokens(); i++) burger[i] = Integer.parseInt(st.nextToken());

        if(burger[0] <= burger[1]) System.out.println(burger[0]*2-1);
        else System.out.println(burger[1]*2+1);
    }
}

