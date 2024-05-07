import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int speedLimit = Integer.parseInt(br.readLine());
        int recordedSpeed = Integer.parseInt(br.readLine());
        int overSpeed = recordedSpeed - speedLimit;

        if(overSpeed <= 0) bw.write("Congratulations, you are within the speed limit!");
        else {
            int fine;
            if (overSpeed <= 20) fine = 100;
            else if (overSpeed <= 30) fine = 270;
            else fine = 500;
            bw.write("You are speeding and your fine is $" + fine + ".");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
