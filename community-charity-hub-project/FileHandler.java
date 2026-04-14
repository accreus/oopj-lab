import java.io.*;
import java.util.*;

public class FileHandler {

    static final String REQUEST_FILE = "requests.txt";
    static final String DONATION_FILE = "donations.txt";

    public static List readRequests() {
        List list = new ArrayList();

        try {
            BufferedReader br = new BufferedReader(new FileReader(REQUEST_FILE));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");

                Request r = new Request(
                        Integer.parseInt(data[0]),
                        data[1],
                        Double.parseDouble(data[2]),
                        data[3],
                        data[4]
                );

                list.add(r);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("No request file found.");
        }

        return list;
    }

    public static void writeRequests(List list) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(REQUEST_FILE));

            for (int i = 0; i < list.size(); i++) {
                Request r = (Request) list.get(i); // 🔴 explicit casting needed
                bw.write(r.toString());
                bw.newLine();
            }

            bw.close();
        } catch (Exception e) {
            System.out.println("Error writing requests.");
        }
    }


    public static void saveDonation(Donation donation) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(DONATION_FILE, true));

            bw.write(donation.toString());
            bw.newLine();

            bw.close();
        } catch (Exception e) {
            System.out.println("Error saving donation.");
        }
    }
}