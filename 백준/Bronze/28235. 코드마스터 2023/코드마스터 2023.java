import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String slogan = br.readLine();
        
        switch (slogan) {
            case "SONGDO":
                bw.write("HIGHSCHOOL");
                break;
            case "CODE":
                bw.write("MASTER");
                break;
            case "2023":
                bw.write("0611");
                break;
            case "ALGORITHM":
                bw.write("CONTEST");
                break;
            default:
                break;
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}
