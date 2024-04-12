import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // "Hook" 문자열 형식에 맞게 출력
        bw.write("#  # #### #### #  #\n");
        bw.write("#### #  # #  # # #\n");
        bw.write("#### #  # #  # # #\n");
        bw.write("#  # #### #### #  #\n");

        // 출력 버퍼 비우기 및 자원 해제
        bw.flush();
        bw.close();
    }
}
