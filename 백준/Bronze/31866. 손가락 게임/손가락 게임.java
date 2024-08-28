import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        int js = Integer.parseInt(line[0]);
        int ij = Integer.parseInt(line[1]);

        if (!determineWinner(js, ij) && !determineWinner(ij, js))
            pw.println("=");
        else if (determineWinner(js, ij))
            pw.println(">");
        else
            pw.println("<");

        pw.flush();
        pw.close();
        br.close();
    }

    private static boolean determineWinner(int p1, int p2) {
        if (p1 != 0 && p1 != 2 && p1 != 5) return false;
        if (p2 != 0 && p2 != 2 && p2 != 5) return true;

        if (p1 == 0) return p2 == 2;
        if (p1 == 2) return p2 == 5;
        if (p1 == 5) return p2 == 0;

        return false;
    }
}
