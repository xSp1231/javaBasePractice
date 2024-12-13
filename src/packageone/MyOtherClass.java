package packageone;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public  class MyOtherClass {
    public static int reverse(int[] list) { //一个静态方法  如果没有static 那么就必须写在类里面
        int result=0;
        for (int i = 0; i < list.length; i++) {
             result+= list[i];
        }
        return result;
    }

    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        }
        else if (score >= 80.0) {
            System.out.println('B');
        }
        else if (score >= 70.0) {
            System.out.println('C');
        }
        else if (score >= 60.0) {
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
    }
    public static int findmax(int... numbers){  //相当于一个数组
        int maxx=-9999999;
        if(numbers.length==0){
            System.out.println("not found");
            return -999999;
        }
        for (int number : numbers) {
            maxx = Math.max(maxx, number);
        }
        return maxx;

    }

    public static void main(String[] args) {
//     int [] a=new int[1000];
//     int i;
//     for( i=1;i<100;i++){
//         a[i]=i;
//     }
     //     for(i=1;i<=100;i++){
//         System.out.println(a[i]);
//     }
// 静态方法调用
//        System.out.println(reverse(a));

//使用 SimpleDateFormat 格式化日期
//     Date d= new Date();
//     System.out.println(d);
//     SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd"); //实例化一个对象
//     System.out.println(ft.format(d));

//

    //   MyClass.display();
     // printGrade(34);
        //方法重载  一个类里面有多个同名方法 但是参数类型可以不一样 返回值 修饰符 可以不一样 //方法重写 是指子类重写父类方法 访问修饰符 参数类型等必须一致
//     cal t= new cal();
//     t.js(1,2.1);
//     t.js(1,1);
//        people t=new people("xsp");
//        System.out.println(t.name);
//        System.out.println(findmax(1,2,3,0,-99,89,23));
//        System.out.println(findmax());

    }
}