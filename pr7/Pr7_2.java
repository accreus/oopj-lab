class OrderedNumberPrinter {
    private int nextNumber = 1;

    public synchronized void printRange(int start, int end) {
        while (nextNumber < start) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        for (int number = start; number <= end; number++) {
            System.out.println(Thread.currentThread().getName() + ": " + number);
            nextNumber = number + 1;
        }

        notifyAll();
    }
}

class RangeThread extends Thread {
    private final OrderedNumberPrinter printer;
    private final int start;
    private final int end;

    RangeThread(String name, OrderedNumberPrinter printer, int start, int end) {
        super(name);
        this.printer = printer;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        printer.printRange(start, end);
    }
}

public class Pr7_2 {
    public static void main(String[] args) {
        System.out.println("Name:_ Enr:_ ");

        OrderedNumberPrinter printer = new OrderedNumberPrinter();

        Thread t1 = new RangeThread("T1", printer, 1, 100);
        Thread t2 = new RangeThread("T2", printer, 101, 200);
        Thread t3 = new RangeThread("T3", printer, 201, 300);

        t1.start();
        t2.start();
        t3.start();
    }
}