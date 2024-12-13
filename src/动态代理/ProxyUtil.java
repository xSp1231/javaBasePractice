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

    Star star= (Star) Proxy.newProxyInstance(
            ProxyUtil.class.getClassLoader(),
            new Class[]{Star.class},
            new InvocationHandler() { //调用处理器
                @Override
                public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                    if("sing".equals(method.getName())){
                        System.out.println("准备话筒，收钱");
                    }
                    else if("dance".equals(method.getName())){
                        System.out.println("准备场地，收钱");
                    }
                    //去找大明星唱歌或跳舞
                    return method.invoke(bigStar,args);
                }
            }

    );

    return star;
   }

}
