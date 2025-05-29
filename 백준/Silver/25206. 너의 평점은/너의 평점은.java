import java.io.*;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static Map<String, Double> gradeMap = Map.of(
        "A+", 4.5,
        "A0", 4.0,
        "B+", 3.5,
        "B0", 3.0,
        "C+", 2.5,
        "C0", 2.0,
        "D+", 1.5,
        "D0", 1.0,
        "F", 0.0
    );

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String line;
        double sum = 0.0, totalCredits = 0.0, avg = 0.0;

        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line);
            String name = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P"))
                continue;

            if (gradeMap.containsKey(grade)) {
                double points = gradeMap.get(grade);
                sum += points * credit;
                totalCredits += credit;
            }
        }

        if (totalCredits == 0)
            avg = 0.0;
        else
            avg = sum / totalCredits;

        bw.write(String.format("%.6f", avg) + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
