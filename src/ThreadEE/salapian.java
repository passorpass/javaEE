package ThreadEE;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class salapian {
    public static void main(String[] args) {

        SellTick sellTick = new SellTick();

        Thread t1 = new Thread(sellTick,"窗口1");
        Thread t2 = new Thread(sellTick,"窗口2");
        Thread t3 = new Thread(sellTick,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
class SellTick implements Runnable {
    private static volatile int Ticknumber = 1;
    private Object object = new Object();
    private int x = 0;
    private Lock lock = new ReentrantLock();

    public void run() {
        while (true) {
            try {


                lock.lock();


                if (Ticknumber <= 100) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + Ticknumber + "张票");
                    Ticknumber++;
                }


            } finally {
                lock.unlock();

            }

            }



            }
        }


//                    } else {
////                        synchronized (object) {
////                            if (Ticknumber <= 100) {
////                                try {
////                                    Thread.sleep(100);
////                                } catch (Exception e) {
////                                    e.printStackTrace();
////                                }
////                                System.out.println(Thread.currentThread().getName() + "正在出售第" + Ticknumber + "张票");
////                                Ticknumber++;
////                            }
////                        }
//
//
//
//
//                    sellTicket();
//
//
//
//                }
//            }
//
//        }x++;
//
//    }
//
//
//}
//
//    private static synchronized void sellTicket() {
//
//            if(Ticknumber <= 0){
//                try {
//                    Thread.sleep(100);
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "正在出售第" + Ticknumber + "张票");
//                Ticknumber++;
//            }
//        }
//
//    }