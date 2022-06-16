package BXOLINE;

import java.util.Random;

public class Producer implements Runnable {
    private Box box;


    public Producer(Box box) {
        this.box = box;

    }

    public void run() {
        try {
            Thread.sleep(1000);


        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= 50; i++) {
            box.put(i);

        }
    }
}
