import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lambda = Integer.parseInt(br.readLine());

        if (lambda >= 620 && lambda <= 780) bw.write("Red");
        else if (lambda >= 590) bw.write("Orange");
        else if (lambda >= 570) bw.write("Yellow");
        else if (lambda >= 495) bw.write("Green");
        else if (lambda >= 450) bw.write("Blue");
        else if (lambda >= 425) bw.write("Indigo");
        else if (lambda >= 380) bw.write("Violet");

        bw.flush();
        bw.close();
        br.close();
    }
}
