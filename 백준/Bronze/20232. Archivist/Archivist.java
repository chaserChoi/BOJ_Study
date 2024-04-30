import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());
        String winner = "";

        switch(year) {
            case 1995:
                winner = "ITMO";
                break;
            case 1996: case 1997: case 2000:
                winner = "SPbSU";
                break;
            case 1998: case 1999: case 2001: case 2002: case 2003:
            case 2004: case 2005: case 2009: case 2010: case 2011:
            case 2012: case 2014: case 2015: case 2016: case 2017:
            case 2019:
                winner = "ITMO";
                break;
            case 2006:
                winner = "PetrSU, ITMO";
                break;
            case 2007: case 2008: case 2013: case 2018:
                winner = "SPbSU";
                break;
            default:
                winner = "Unknown";
                break;
        }

        bw.write(winner);

        bw.flush();
        br.close();
        bw.close();
    }
}
