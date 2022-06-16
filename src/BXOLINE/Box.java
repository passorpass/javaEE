package BXOLINE;

import java.io.IOException;

public class Box {
    private int mike;

    private boolean state = false;

   public synchronized void put(int mike){

        if(state){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        this.mike=mike;
       try {
           Thread.sleep(100);
           System.out.println("送奶工将第"+this.mike + "瓶奶放入奶箱"
           );
       }catch (Exception e){
           e.printStackTrace();
       }

        state = true;
        notifyAll();

    }
    public synchronized void get(){
        if(!state){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("用户拿到第"+this.mike+"瓶奶");

        state = false;
        notifyAll();
    }
}
