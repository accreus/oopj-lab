import java.util.*;

public class Donee extends User {

    public Donee(String name) {
        super(name);
    }

    public void createRequest(Scanner sc) {
        sc.nextLine(); // clear buffer

        System.out.print("Enter description: ");
        String desc = sc.nextLine();

        System.out.print("Enter amount needed: ");
        double amount = sc.nextDouble();

        List list = FileHandler.readRequests();
        int id = list.size() + 1;

        Request r = new Request(id, desc, amount, "Pending", name);
        list.add(r);

        FileHandler.writeRequests(list);

        System.out.println("Request created successfully!");
    }

    public void viewOwnRequests() {
        List list = FileHandler.readRequests();
        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            Request r = (Request) list.get(i); // casting

            if (r.createdBy != null && r.createdBy.trim().equalsIgnoreCase(name.trim())) {
                System.out.println("ID: " + r.id + ", Desc: " + r.description +
                        ", Amount: " + r.amount + ", Status: " + r.status);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No requests found for your name.");
        }
    }
}