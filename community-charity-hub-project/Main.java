import java.util.*;

public class Main {

    public static void donorMenu(Scanner sc, Donor donor) {
        while (true) {
            System.out.println("\n--- Donor Menu ---");
            System.out.println("1. View All Requests");
            System.out.println("2. Donate to a Request");
            System.out.println("3. Back to Main Menu \n");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    donor.viewRequests();
                    break;
                case 2:
                    donor.donate(sc);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void needyMenu(Scanner sc, Donee np) {
        while (true) {
            System.out.println("\n--- Needy Person Menu ---");
            System.out.println("1. Create Request");
            System.out.println("2. View My Requests");
            System.out.println("3. Back to Main Menu \n");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    np.createRequest(sc);
                    break;
                case 2:
                    np.viewOwnRequests();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Community Charity Hub ===");
            System.out.println("1. Act as Donor");
            System.out.println("2. Act as Needy Person");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter your name: ");
                    String donorName = sc.nextLine();
                    Donor donor = new Donor(donorName);
                    donorMenu(sc, donor);
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter your name: ");
                    String needyName = sc.nextLine();
                    Donee np = new Donee(needyName);
                    needyMenu(sc, np);
                    break;

                case 3:
                    System.out.println("Thank you for using Community Charity Hub!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}