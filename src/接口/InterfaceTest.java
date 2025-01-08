package 接口;

/**
 * @Author xushupeng
 * @Date 2024-12-04 23:22
 */

public class InterfaceTest implements live{

    public static void main(String[] args) {
     System.out.println(ContainConstantInterface.ACCEPT);
     InterfaceTest interfaceTest=new InterfaceTest();
     interfaceTest.drink();
     System.out.println(InterfaceTest.number);
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }

    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void drink() {
        System.out.println("drink");
    }
}
