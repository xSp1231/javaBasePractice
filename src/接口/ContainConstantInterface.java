package 接口;



/**
 * @Author xushupeng
 * @Date 2024-12-15 12:34
 */
// 接口里面可以定义常量
// 接口里面可以定义静态方法
// 接口里面可以定义抽象方法

public interface ContainConstantInterface {
    String salt="xsadafasfasfasfhsrgdsgrereta";
    static void print(){
         System.out.println("接口里面的静态方法");
    }
    User getUser(User user);

}
