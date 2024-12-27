package 多态数组;


/**
 * @Author xushupeng
 * @Date 2024-12-14 20:09
 */
interface AnimalInterface {
    void sound(); // 接口中的方法声明
}
class Dog implements AnimalInterface {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

// 实现接口的 Cat 类
class Cat implements AnimalInterface {
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}
// 实现接口的 Bird 类
class Bird implements AnimalInterface {
    @Override
    public void sound() {
        System.out.println("Chirp!");
    }
}
public class InterfaceArray {
    // 定义接口
    // 实现接口的 Dog 类
        public static void main(String[] args) {
            // 创建接口数组
           AnimalInterface[]animals=new AnimalInterface[3];

            // 向数组中添加不同类型的对象
            animals[0] = new Dog();
            animals[1] = new Cat();
            animals[2] = new Bird();

            // 遍历数组并调用方法
            for (AnimalInterface animal : animals) {
                animal.sound(); // 根据实际对象调用相应的方法
            }
        }

}
