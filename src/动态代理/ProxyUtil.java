package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author xushupeng
 * @Date 2024-12-13 18:15
 * 创建一个代理
 */
public class ProxyUtil {
   public static Star createProxy(BigStar bigStar){
       // java.lang.reflect.Proxy类：提供了对动态代理实例的创建方法。

  /**
 * public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
 *
 * 参数一：用于指定用于加载代理类的类加载器。
 * 参数二：指定代理类时所实现的接口类型。
 * 参数三：用于指定代理类的调用处理器。
 */
// 创建一个Star对象的代理实例
Star star= (Star) Proxy.newProxyInstance(
        ProxyUtil.class.getClassLoader(), // 使用ProxyUtil类的类加载器
        new Class[]{Star.class}, // 代理类实现的接口
        new InvocationHandler() { // 调用处理器
            @Override
            public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                System.out.println("method is "+method);
                System.out.println("args is "+args[0]);
                // 当调用sing方法时，输出准备话筒和收钱的信息
                if("sing".equals(method.getName())){
                    System.out.println("准备话筒，收钱");
                }
                // 当调用dance方法时，输出准备场地和收钱的信息
                else if("dance".equals(method.getName())){
                    System.out.println("准备场地，收钱");
                }
                // 找到大明星执行唱歌或跳舞的方法，并传递参数
                // 这里是核心业务逻辑，代理模式允许我们在调用真实对象之前或之后执行额外的操作
                return method.invoke(bigStar,args);
            }
        }
);




    return star;
   }

}
