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

        if (S.equals("fdsajkl;") || S.equals("jkl;fdsa")) bw.write("in-out\n");
        else if (S.equals("asdf;lkj") || S.equals(";lkjasdf")) bw.write("out-in\n");
        else if (S.equals("asdfjkl;")) bw.write("stairs\n");
        else if (S.equals(";lkjfdsa")) bw.write("reverse\n");
        else bw.write("molu\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
