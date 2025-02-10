import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            String[] aCards = br.readLine().split(" ");
            String[] bCards = br.readLine().split(" ");

            for (int i = 0; i < n; i++)
                a.add(Integer.parseInt(aCards[i]));
            for (int i = 0; i < n; i++)
                b.add(Integer.parseInt(bCards[i]));

            int aPnt = 0;
            int bPnt = 0;

            for (int i = 0; i < n; i++) {
                int aCard = a.get(i);
                int bCard = b.get(i);

                if (aCard > bCard + 1)
                    aPnt += aCard;
                else if (bCard > aCard + 1)
                    bPnt += bCard;
                else if (aCard == bCard + 1)
                    bPnt += (bCard == 1 ? 6 : aCard + bCard);
                else if (bCard == aCard + 1)
                    aPnt += (aCard == 1 ? 6 : aCard + bCard);
            }

            System.out.println("A has " + aPnt + " points. B has " + bPnt + " points.\n");
        }
    }
}
