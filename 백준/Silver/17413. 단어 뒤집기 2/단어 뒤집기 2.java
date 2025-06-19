import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        boolean isTag = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '<') {
                result.append(temp.reverse());
                temp.setLength(0);
                isTag = true;
                result.append(c);
            } else if (c == '>') {
                isTag = false;
                result.append(c);
            } else if (isTag)
                result.append(c);
            else {
                if (c == ' ') {
                    result.append(temp.reverse());
                    result.append(' ');
                    temp.setLength(0);
                } else
                    temp.append(c);
            }
        }
        result.append(temp.reverse());

        System.out.println(result);

        br.close();
    }
}
