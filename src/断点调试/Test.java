package 断点调试;

/**
 * @Author xushupeng
 * @Date 2024-12-29 16:14
 */
public class Test {

    public static void test1(){
        System.out.println("test1");
        test2();
    }
    public static void test2(){
        System.out.println("test2");
        test3();
    }
    public static void test3(){
        System.out.println("test3 -- end");
    }
    public static void main(String[] args) {
        System.out.println("start!");
        test1(); //静态方法内部不能使用成员方法 静态方法内部不能使用成员变量
        int a = 10;
        int b=11;

        for(int i=1;i<=100;i++){
            System.out.println(i);
        }


        int max=FunctionUtil.getMax(a,b);
        System.out.println("max is "+max);

        int []arr=new int[]{1,2,3,4,5,6};
        System.out.println(arr.length);
        int sum=FunctionUtil.getSum(arr);
        System.out.println(String.format("sum is %d",sum));
        User user=new User("xsp",18);
        FunctionUtil.getAllFields(user);

        System.out.println("ending!");


    }
}
