import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String abbreviation = br.readLine();

        switch(abbreviation) {
            case "NLCS":
                bw.write("North London Collegiate School");
                break;
            case "BHA":
                bw.write("Branksome Hall Asia");
                break;
            case "KIS":
                bw.write("Korea International School");
                break;
            case "SJA":
                bw.write("St. Johnsbury Academy");
                break;
            default:
                bw.write("Unknown School");
                break;
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}
