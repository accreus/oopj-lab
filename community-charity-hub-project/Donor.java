import java.util.*;

public class Donor extends User {

    public Donor(String name) {
        super(name);
    }

    public void viewRequests() {
        List list = FileHandler.readRequests();

        if (list.isEmpty()) {
            System.out.println("No requests available.");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            Request r = (Request) list.get(i); // casting

            System.out.println("ID: " + r.id + ", Desc: " + r.description +
                    ", Amount Needed: " + r.amount + ", Status: " + r.status +
                    ", Requested By: " + r.createdBy);
        }
    }

    public void donate(Scanner sc) {
        System.out.println("\n1. View all requests and continue");
        System.out.println("2. Donate directly with request ID");
        System.out.println("3. Cancel");
        System.out.print("Choose option: ");
        int option = sc.nextInt();

        if (option == 1) {
            viewRequests();
        } else if (option == 3) {
            return;
        } else if (option != 2) {
            System.out.println("Invalid option.");
            return;
        }

        System.out.print("Enter Request ID: ");
        int id = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount must be greater than 0.");
            return;
        }

        List list = FileHandler.readRequests();

        for (int i = 0; i < list.size(); i++) {
            Request r = (Request) list.get(i); // casting

            if (r.id == id && r.status.equals("Pending")) {
                if (amount > r.amount) {
                    System.out.println("Donation exceeds required amount. Donate up to " + r.amount + " only.");
                    return;
                }

                r.amount = r.amount - amount;
                if (r.amount == 0) {
                    r.status = "Fulfilled";
                }

                FileHandler.writeRequests(list);

                Donation d = new Donation(name, amount, id);
                FileHandler.saveDonation(d);

                System.out.println("Donation successful! File updated immediately.");
                return;
            }
        }

        System.out.println("Invalid request or already fulfilled.");
    }
}