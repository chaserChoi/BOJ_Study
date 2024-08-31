import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int ans = 0;
        
        int firDie[] = new int[n];
        int secDie[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            firDie[i] = Integer.parseInt(st1.nextToken());
            secDie[i] = Integer.parseInt(st2.nextToken());
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (firDie[i] > secDie[j]) 
                    ans++;
                if (firDie[i] < secDie[j]) 
                    ans--;
            }
        }

        if (ans > 0)
            pw.println("first");
        else if (ans < 0)
            pw.println("second");
        else
            pw.println("tie");

        pw.flush();
        pw.close();
        br.close();
    }
}
