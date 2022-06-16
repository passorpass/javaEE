package BXOLINE;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();

        Producer producer = new Producer(box);

        Custoer custoer = new Custoer(box);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(custoer);

        t2.start();
        t1.start();

    }
}
