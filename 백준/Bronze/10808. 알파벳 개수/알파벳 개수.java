import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();

        int[] alphabetCount = new int[26];

        for (char ch : S.toCharArray()) alphabetCount[ch - 'a']++;

        for (int count : alphabetCount) bw.write(count + " ");
        
        br.close();
        bw.flush();
        bw.close();
    }
}
