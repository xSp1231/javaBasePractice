package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author xushupeng
 * @Date 2024-12-13 14:43
 */
public class test02 {

    public static void main(String[] args) throws ClassNotFoundException {

        //获取class字节码文件对象
        Class clazz=Class.forName("reflect.Student");

        //获取构造方法
        Constructor[] con=clazz.getConstructors();

        for(Constructor c:con){
            System.out.println(c);
        }
        Method[] methods = String.class.getDeclaredMethods();
        for(Method m:methods){
            System.out.println(m);
        }
        Student s=new Student("xsp",22);


    }
}
