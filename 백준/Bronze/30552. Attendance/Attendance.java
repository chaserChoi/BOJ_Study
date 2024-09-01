import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> students = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String line = br.readLine().trim();
            if (line.equals("Present!")) {
                if (!students.isEmpty())
                    set.add(students.get(students.size() - 1));
            } else
                students.add(line);
        }

        boolean hasAbsent = false;
        for (String s : students) {
            if (!set.contains(s)) {
                pw.println(s);
                hasAbsent = true;
            }
        }

        if (!hasAbsent)
            pw.println("No Absences");

        pw.flush();
        pw.close();
        br.close();
    }
}
