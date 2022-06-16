package LAMBDA;

public class EatableDemo {

    public static void main(String[] args) {

    Eatable e = new EatableImpl();
    useEatable(e);

    //匿名类的内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一苹果，医生远离我");
            }
        });

        //lambda表达式
        useEatable(() -> {
            System.out.println("一天一苹果，医生远离我");
        });

}
    private static void useEatable(Eatable e){
        e.eat();
}


}
