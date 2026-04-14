public class Request {
    int id;
    String description;
    double amount;
    String status;
    String createdBy;

    public Request(int id, String description, double amount, String status, String createdBy) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.status = status;
        this.createdBy = createdBy;
    }

    // for storing data in file
    public String toString() {
        return id + "|" + description + "|" + amount + "|" + status + "|" + createdBy;
    }
}