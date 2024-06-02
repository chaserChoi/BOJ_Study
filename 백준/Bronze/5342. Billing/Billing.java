import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double totalCost = 0.0;

        while (true) {
            String item = br.readLine();
            if ("EOI".equals(item)) break;

            switch (item) {
                case "Paper":
                    totalCost += 57.99;
                    break;
                case "Printer":
                    totalCost += 120.50;
                    break;
                case "Planners":
                    totalCost += 31.25;
                    break;
                case "Binders":
                    totalCost += 22.50;
                    break;
                case "Calendar":
                    totalCost += 10.95;
                    break;
                case "Notebooks":
                    totalCost += 11.20;
                    break;
                case "Ink":
                    totalCost += 66.95;
                    break;
            }
        }

        bw.write(String.format("$%.2f", totalCost));

        bw.flush();
        bw.close();
        br.close(); 
    }
}
