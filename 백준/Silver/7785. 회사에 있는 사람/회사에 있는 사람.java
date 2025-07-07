import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String person = st.nextToken();
            String status = st.nextToken();

            if (status.equals("enter")) {
                if (!map.containsKey(person))
                    map.put(person, status);
            } else if (status.equals("leave")) {
                if (map.containsKey(person))
                    map.remove(person);
            }
        }

        List<String> list = new ArrayList<>();
        for (String name : map.keySet())
          list.add(name);
        Collections.sort(list, Collections.reverseOrder());
        for (String s : list) {
          sb.append(s).append("\n");
        }

        System.out.print(sb);

        br.close();
    }
}