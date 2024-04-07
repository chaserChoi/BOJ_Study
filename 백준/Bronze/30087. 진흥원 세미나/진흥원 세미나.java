import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String seminar = br.readLine();
            String roomNumber = "";

            switch (seminar) {
                case "Algorithm":
                    roomNumber = "204";
                    break;
                case "DataAnalysis":
                    roomNumber = "207";
                    break;
                case "ArtificialIntelligence":
                    roomNumber = "302";
                    break;
                case "CyberSecurity":
                    roomNumber = "B101";
                    break;
                case "Network":
                    roomNumber = "303";
                    break;
                case "Startup":
                    roomNumber = "501";
                    break;
                case "TestStrategy":
                    roomNumber = "105";
                    break;
            }
            bw.write(roomNumber + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
