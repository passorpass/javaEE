package BXOLINE;

public class Custoer implements Runnable{
    private Box box;
    public Custoer(Box box) {
        this.box=box;
    }
    public void run(){
        while (true){
            box.get();
        }
    }
}
