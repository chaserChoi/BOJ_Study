import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int tYear = Integer.parseInt(st.nextToken());
        int tMonth = Integer.parseInt(st.nextToken());
        int tDay = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int dYear = Integer.parseInt(st.nextToken());
        int dMonth = Integer.parseInt(st.nextToken());
        int dDay = Integer.parseInt(st.nextToken());

        int total1 = calcDay(tYear, tMonth, tDay);
        int total2 = calcDay(dYear, dMonth, dDay);

        if(dYear - tYear > 1000 || dYear - tYear == 1000 && (tMonth < dMonth || tMonth == dMonth && tDay <= dDay))
            pw.println("gg");
        else
            pw.println("D-" + (total2 - total1));

        pw.flush();
        pw.close();
        br.close();
    }

    static int calcDay(int y, int m, int d){
        int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = 0;

        for(int i = 1; i < y; i++)
            days += 365 + checkYear(i);

        for (int i = 1; i < m; i++) {
            if (i == 2) days += checkYear(y);
            days += day[i];
        }
        
        days += d;

        return days;
    }

    static int checkYear(int y){
        if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
            return 1;
        else
            return 0;
    }
}
