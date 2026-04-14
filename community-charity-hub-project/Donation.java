public class Donation {
    String donorName;
    double amount;
    int requestId;

    public Donation(String donorName, double amount, int requestId) {
        this.donorName = donorName;
        this.amount = amount;
        this.requestId = requestId;
    }

    // format for storing data in text file 
    public String toString() {
        return donorName + "|" + amount + "|" + requestId;
    }
}