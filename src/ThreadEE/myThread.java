package ThreadEE;

public class myThread extends Thread{
  public myThread(){}
    public myThread(String name){
      super(name);
    }
    public void run(){
        for(int i = 0 ; i < 100 ; i ++){
            System.out.println(getName()+" : "+i);
           try {
               Thread.sleep(100);
           }catch (Exception e){
               e.printStackTrace();
           }
        }
    }

}
//    public Thread() {
//        init(null, null, "Thread-" + nextThreadNum(), 0);
//    }

