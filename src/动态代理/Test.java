package 动态代理;

/**
 * @Author xushupeng
 * @Date 2024-12-13 18:45
 */
public class Test {

    public static void main(String[] args) {
        //1.创建代理对象
        Star proxy = ProxyUtil.createProxy(new BigStar("鸡哥"));
        //2.调用唱歌的方法
        String result = proxy.sing("只因你太美！");
        System.out.println(result);

    }
}
