import java.io.*;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String[] f = br.readLine().split(" ");
        String[] m = br.readLine().split(" ");
        Set<String> offspring = new TreeSet<>();

        for (String fbody : f) {
            for (String ftail : f) {
                for (String mbody : m) {
                    for (String mtail : m) {
                        offspring.add(fbody + " " + ftail);
                        offspring.add(mbody + " " + mtail);
                        offspring.add(fbody + " " + mtail);
                        offspring.add(mbody + " " + ftail);
                    }
                }
            }
        }

        for (String pair : offspring)
            pw.println(pair);

        pw.flush();
        pw.close();
        br.close();
    }
}
