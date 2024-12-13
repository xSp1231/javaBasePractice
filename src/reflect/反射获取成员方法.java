package reflect;

import java.lang.reflect.Method;

/**
 * @Author xushupeng
 * @Date 2024-12-13 15:25
 */
public class 反射获取成员方法 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class z = Class.forName("reflect.Student");
        //获取成员方法
        Method[]methods= z.getMethods();
        for (Method method:methods){
            System.out.println(method.getName());
        }
       Method m=z.getDeclaredMethod("info");
        System.out.println(m);




    }
}
