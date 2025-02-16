import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = br.readLine()).equals("# 0")) {
            String[] first = line.split(" ");
            String flight = first[0];
            int bookedSeats = Integer.parseInt(first[1]);

            while (true) {
                String transaction = br.readLine();
                if (transaction.equals("X 0"))
                    break;

                String[] parts = transaction.split(" ");
                char action = parts[0].charAt(0);
                int seats = Integer.parseInt(parts[1]);

                if (action == 'B') {
                    if (bookedSeats + seats <= 68)
                        bookedSeats += seats;
                } else if (action == 'C') {
                    if (seats <= bookedSeats)
                        bookedSeats -= seats;
                }
            }

            System.out.println(flight + " " + bookedSeats);
        }
    }
}
