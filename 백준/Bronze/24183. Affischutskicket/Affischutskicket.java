import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int ytviktKuvert = Integer.parseInt(st.nextToken());
        int ytviktAffisch = Integer.parseInt(st.nextToken());
        int ytviktInfo = Integer.parseInt(st.nextToken());
        
        double areaKuvert = 2 * (229.0 / 1000) * (324.0 / 1000); 
        double areaAffisch = 2 * (297.0 / 1000) * (420.0 / 1000); 
        double areaInfo = (210.0 / 1000) * (297.0 / 1000); 

        double totalWeight = (areaKuvert * ytviktKuvert) + (areaAffisch * ytviktAffisch) + (areaInfo * ytviktInfo);
        bw.write(String.format("%.6f", totalWeight));
        
        bw.flush();
        br.close();
        bw.close();
    }
}
