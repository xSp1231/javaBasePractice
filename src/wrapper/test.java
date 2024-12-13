package wrapper;

/**
 * @Author xushupeng
 * @Date 2023-07-20 14:09
 */

//包装类 int  integer
public class test {
    public static void main(String[] args) {

       //装箱 基本类型-->包装类  //拆箱  ....
       //自动装箱 拆箱
//        int n1=100;
//        Integer integer1=n1;
//        System.out.println(integer1);
//        //自动拆箱
//        Integer integer2=200;
//        int n2=integer2;
//        System.out.println(n2);
//
//        double a=2.8;
//        System.out.println(a);
//        Double b=2.1;
//        System.out.println(b.doubleValue());
        //double 64位 int 32位  大到小 需要显示类型转换
        //int 转为double 小到大 不需要 自动转换

        Integer a=10;
        String s=String.valueOf(a);
        String s1=a.toString();
        System.out.println(s);









    }
}
