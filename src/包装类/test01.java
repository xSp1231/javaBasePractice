package 包装类;

interface A{
    public void eat();
}

public class test01 {
    public static void main(String[] args) {
        long a= 12111L;
        long b=12111L;

        System.out.println(a==b);

        for(int i=0;i<=3;i++){
            System.out.println(i);
        }

        f(new A(){
            @Override
            public void eat(){
                System.out.println("eat");
            }
        });

    }
    public static void f(A a){
        a.eat();
    }
}
