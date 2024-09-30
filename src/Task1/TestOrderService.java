package Task1;

public class TestOrderService {
    public static void main(String[] args) {
        OrderService counter = new OrderService();

        Runnable runnable = () ->{
            counter.increment();
        };

        for (int i = 0; i < 100; i++) {
            new Thread(runnable).start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(counter);
    }
}
