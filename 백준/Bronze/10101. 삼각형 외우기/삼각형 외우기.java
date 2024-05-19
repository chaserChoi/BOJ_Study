import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int angle1 = Integer.parseInt(br.readLine());
        int angle2 = Integer.parseInt(br.readLine());
        int angle3 = Integer.parseInt(br.readLine());

        int sum = angle1 + angle2 + angle3;

        if (sum == 180) {
            if (angle1 == 60 && angle2 == 60) bw.write("Equilateral");
            else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) bw.write("Isosceles");
            else bw.write("Scalene");
        } else bw.write("Error");

        bw.flush();
        br.close();
        bw.close(); 
    }
}
