import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String s = "";
        long n = 0;

        for (int i = 0; i < 3; i++) {
            String a = br.readLine();

            switch(a) {
                case "black":
                    if (i == 2)
                        n *= 1;
                    else
                        s += "0";
                    break;
                case "brown":
                    if (i == 2)
                        n *= 10;
                    else
                        s += "1";
                    break;
                case "red":
                    if (i == 2)
                        n *= 100;
                    else
                        s += "2";
                    break;
                case "orange":
                    if (i == 2)
                        n *= 1000;
                    else
                        s += "3";
                    break;
                case "yellow":
                    if (i == 2)
                        n *= 10000;
                    else
                        s += "4";
                    break;
                case "green":
                    if (i == 2)
                        n *= 100000;
                    else
                        s += "5";
                    break;
                case "blue":
                    if (i == 2)
                        n *= 1000000;
                    else
                        s += "6";
                    break;
                case "violet":
                    if (i == 2)
                        n *= 10000000;
                    else
                        s += "7";
                    break;
                case "grey":
                    if (i == 2)
                        n *= 100000000;
                    else
                        s += "8";
                    break;
                case "white":
                    if (i == 2)
                        n *= 1000000000;
                    else
                        s += "9";
                    break;
            }

            if (i == 1)
                n = Long.parseLong(s);
        }

        pw.println(n);

        pw.flush();
        pw.close();
        br.close();
    }
}
