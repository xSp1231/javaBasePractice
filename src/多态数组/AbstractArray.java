package 多态数组;

/**
 * @Author xushupeng
 * @Date 2024-12-14 20:12
 */

// 定义抽象类
abstract class Animal {
    abstract void sound(); // 抽象方法
}

// 实现抽象类的 Dog 类
class AbstractDog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof!");
    }
}

// 实现抽象类的 Cat 类
class AbstractCat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow!");
    }
}

// 实现抽象类的 Bird 类
class AbstractBird extends Animal {
    @Override
    void sound() {
        System.out.println("Chirp!");
    }
}

public class AbstractArray {
    public static void main(String[] args) {
        // 创建抽象类的多态数组
        Animal[] animals = new Animal[3];

        // 向数组中添加不同类型的对象
        animals[0] = new AbstractDog();
        animals[1] = new AbstractCat();
        animals[2] = new AbstractBird();

        // 遍历数组并调用方法
        for (Animal animal : animals) {
            animal.sound(); // 根据实际对象调用相应的方法
        }
    }
}

