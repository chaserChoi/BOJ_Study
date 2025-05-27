import java.io.*;

// BOJ 28702 - FizzBuzz
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = 0;
        boolean flag = false;

        for (int i = 0; i < 3; i++) {
            String line = br.readLine();
            char c = line.charAt(0);

            if (c != 'F' && c != 'B') {
                num = Integer.parseInt(line);
                flag = true;
            }

            if (flag)
                num++;
        }

        if (num % 3 == 0) {
            if (num % 5 == 0)
                bw.write("FizzBuzz\n");
            else
                bw.write("Fizz\n");
        } else {
            if (num % 5 == 0)
                bw.write("Buzz\n");
            else
                bw.write(num + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
