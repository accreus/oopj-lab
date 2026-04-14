class NumberPrinter extends Thread {
    private final int start;
    private final int end;
    private final long delayMillis;

    NumberPrinter(int start, int end, long delayMillis) {
        this.start = start;
        this.end = end;
        this.delayMillis = delayMillis;
    }

    @Override
    public void run() {
        for (int number = start; number <= end; number++) {
            System.out.println(Thread.currentThread().getName() + ": " + number);

            try {
                Thread.sleep(delayMillis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted: " + Thread.currentThread().getName());
                return;
            }
        }
    }
}

public class Pr7_1 {
    public static void main(String[] args) {
        System.out.println("Name:_ Enr:_ ");

        Thread firstThread = new NumberPrinter(1, 10, 1000);
        firstThread.setName("Thread-1");

        Thread secondThread = new NumberPrinter(11, 20, 500);
        secondThread.setName("Thread-2");

        firstThread.start();
        secondThread.start();
    }
}