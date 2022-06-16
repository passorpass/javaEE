package LAMBDA;

public class FlybleDemo {
    public static void main(String[] args) {
        //匿名内部类
        useFlyable(new Flyble() {
            @Override
            public void fly(String s) {
                System.out.print(s);
                System.out.println("用翅膀飞");
            }
        });
        System.out.println("-----------------------------");
        //lambda改写
        useFlyable((String s) ->{
            System.out.print(s);
            System.out.println("用翅膀飞");

        });
    }
    private static void useFlyable(Flyble f){
        f.fly("麻雀");
    }
}
