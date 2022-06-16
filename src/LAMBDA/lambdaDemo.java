package LAMBDA;

public class lambdaDemo {
    public static void main(String[] args) {
//    //实现类的方式需求
//        MyRunable my = new MyRunable();
//        Thread t = new Thread(my);
//        t.start();

    //匿名内部类的方式改进
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程程序启动了");
//            }
//        }).start();

        //lambda表达式的方式改进
        useAddable((x ,y) ->{
            return x+y;
        });
        useFlyable(s ->
            System.out.println(s)

        );

    }
    private static void useFlyable(Flyble f){
        f.fly("麻雀");
    }
    private static void useAddable(Addable a){
        int sum = a.add(4,5);
        System.out.println(sum);
    }
}
