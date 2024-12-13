package reflect;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author xushupeng
 * @Date 2024-12-13 16:09
 * 注意看配置文件
 */
public class 反射练习结合配置文件动态创建 {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.读取配置文件
        Properties properties = new Properties();
        FileInputStream fis=new FileInputStream("src/reflect/prop.properties");
        properties.load(fis);
        fis.close();
        System.out.println(properties);
        //2.获取配置文件中的全类名
        String classname=properties.getProperty("classname");
        System.out.println(classname);
        //获取配置文件的方法名
        String methodName=properties.getProperty("method");
        System.out.println(methodName);
        //根据全类名 获取字节码文件对象
        Class clazz=Class.forName(classname);
        //获取构造方法 getDeclaredConstructor() 方法用于获取该类的默认构造函数（即无参数的构造函数）  如果方法中含有参数 那么就可以指定构造函数
        Constructor con = clazz.getDeclaredConstructor(String.class, int.class);


        Object o=con.newInstance("xsp",22);

        System.out.println(o);
        Student student=(Student)o;//向下转型
        student.info();

        //获取成员方法并运行
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(o);

    }


}
