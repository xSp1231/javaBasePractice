package 接口;

/**
 * @Author xushupeng
 * @Date 2024-12-15 12:39
 */

class Mapper implements ContainConstantInterface{
    public User getUser(User user) {
        return user;
    }
}
public class ContainConstantInterfaceTest {
    public static void main(String[] args) {
        System.out.println(ContainConstantInterface.salt);
        User user = new User("xsp","123");
        Mapper mapper=new Mapper();
        User user1 = mapper.getUser(user);
        System.out.println(user1);
    }
}
