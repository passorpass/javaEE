package ThreadEE;

public class ThreadTest0 {
    public static void main(String[] args) {
    myThread thread1 = new myThread("A-");
    myThread thread2 = new myThread("B-");
    myThread thread3 = new myThread("C-");

//    thread1.run();
//    thread2.run();
  thread2.setName("A-");
  thread1.setName("B-");
  thread3.setName("C-");

//        System.out.println(thread1.getPriority());
//        System.out.println(thread2.getPriority());
//        System.out.println(thread3.getPriority());





//        System.out.println(Thread.MAX_PRIORITY);
//        System.out.println(Thread.MIN_PRIORITY);
//        System.out.println(Thread.NORM_PRIORITY);
////       run相当与普通 。strat相同于vim调用run
//        System.out.println(Thread.currentThread().getName());

//        thread1.setPriority(6);
//        thread2.setPriority(8);
//        thread3.setPriority(1);
//
        Thread.currentThread().setName("DD-");

//try {
//    thread1.join();
//}
//catch (Exception e){
//    e.printStackTrace();
//}
        //设置守护线程
        thread2.setDaemon(true);
        thread3.setDaemon(true);
        thread2.start();
        thread3.start();
    for(int i = 0 ; i < 50 ; i++){
        System.out.println(Thread.currentThread().getName()+" "+i);
    }


    }
}
