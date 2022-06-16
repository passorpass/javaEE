package LAMBDA;

public class AddableDemo {
    public static void main(String[] args) {
        //匿名内部类
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        });
        //lambda
        useAddable((int x , int y) ->{
            return x + y;
        });

    }
    private static void useAddable(Addable a){
        int sum = a.add(4,5);
        System.out.println(sum);
    }
}
