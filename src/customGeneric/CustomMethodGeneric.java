package customGeneric;

import javafx.scene.chart.ValueAxis;

/**
 * @Author xushupeng
 * @Date 2023-08-27 19:45
 */
public class CustomMethodGeneric {
    public static void main(String[] args) {
        B b = new B();
        //在调用泛型方法的时候 要制定类型
        b.say("xsp");
        b.say(123);//T不可谓基本类型  123 int=>integer 发生了装箱
    }
}
class B{
    public<T> void say(T t){//定义泛型方法
        System.out.println("泛型的类型是 "+t.getClass());
    }
}

