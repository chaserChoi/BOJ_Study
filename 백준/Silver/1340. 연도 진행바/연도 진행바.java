import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] time = br.readLine().split(" ");

        int y = Integer.parseInt(time[2]);
        boolean yCheck = false;

        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
            yCheck = true;

        String month = time[0];
        int mon = 0;
        switch (month) {
            case "January":
                mon = 1;
                break;
            case "February":
                mon = 2;
                break;
            case "March":
                mon = 3;
                break;
            case "April":
                mon = 4;
                break;
            case "May":
                mon = 5;
                break;
            case "June":
                mon = 6;
                break;
            case "July":
                mon = 7;
                break;
            case "August":
                mon = 8;
                break;
            case "September":
                mon = 9;
                break;
            case "October":
                mon = 10;
                break;
            case "November":
                mon = 11;
                break;
            case "December":
                mon = 12;
                break;
        }

        int days[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int d = Integer.parseInt(time[1].split(",")[0]);
        int dCnt = 0;

        for (int i = 1; i < mon; i++) {
            if (yCheck && i == 2) {
                dCnt += 29;
                continue;
            }
            dCnt += days[i];
        }
        dCnt += d;

        int h = 60 * Integer.parseInt(time[3].split(":")[0]);
        int m = Integer.parseInt(time[3].split(":")[1]);
        int timeHM = h + m;
        int timeTohour = 60 * 24 * (dCnt - 1) + timeHM;
        int totalY = 0;

        if (yCheck)
            totalY = 366 * 60 * 24;
        else
            totalY = 365 * 60 * 24;

        pw.println((double) ((double) timeTohour * 100 / (double) totalY));

        pw.flush();
        pw.close();
        br.close();
    }
}
