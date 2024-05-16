import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int birthYear = Integer.parseInt(st.nextToken());
        int birthMonth = Integer.parseInt(st.nextToken());
        int birthDay = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int currentYear = Integer.parseInt(st.nextToken());
        int currentMonth = Integer.parseInt(st.nextToken());
        int currentDay = Integer.parseInt(st.nextToken());

        int age = currentYear - birthYear;
        if (birthMonth > currentMonth || (birthMonth == currentMonth && birthDay > currentDay)) {
            age--;
        }

        int countingAge = currentYear - birthYear + 1;

        int yearlyAge = currentYear - birthYear;

        bw.write(age + "\n" + countingAge + "\n" + yearlyAge);

        bw.flush();
        br.close();
        bw.close();
    }
}
