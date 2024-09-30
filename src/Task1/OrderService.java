package Task1;

public class OrderService {
    private int count;

    public synchronized void increment() {
        count++;
    }

    @Override
    public String toString() {
        return "OrderService{" +
                "count=" + count +
                '}';
    }
}
