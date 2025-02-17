import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = br.readLine()).equals("# 0")) {
            String[] libInfo = line.split(" ");
            String libName = libInfo[0];
            int charWidth = Integer.parseInt(libInfo[1]);

            int num = Integer.parseInt(br.readLine());
            System.out.println(libName + " Library");

            for (int i = 1; i <= num; i++) {
                String[] bookInfo = br.readLine().split(" ", 2);
                int bookWidth = Integer.parseInt(bookInfo[0]);
                String label = bookInfo[1];

                int required = (label.length() * charWidth) + 2;

                if (required <= bookWidth)
                    System.out.println("Book " + i + " horizontal");
                else
                    System.out.println("Book " + i + " vertical");
            }
        }
    }
}
