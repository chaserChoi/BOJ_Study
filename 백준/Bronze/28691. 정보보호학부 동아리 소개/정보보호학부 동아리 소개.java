import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char firstChar = br.readLine().charAt(0);
        
        String clubName = "";

        switch (firstChar) {
            case 'M':
                clubName = "MatKor";
                break;
            case 'W':
                clubName = "WiCys";
                break;
            case 'C':
                clubName = "CyKor";
                break;
            case 'A':
                clubName = "AlKor";
                break;
            case '$':
                clubName = "$clear";
                break;
            default:
                clubName = "Unknown"; 
        }
        
        bw.write(clubName + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
