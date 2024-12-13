package 多态;

/**
 * @Author xushupeng
 * @Date 2024-12-12 21:23
 */
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
    void play(){
        System.out.println("plays");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    public void sleep(){
        System.out.println("Dog sleeps");
    }

    //其实Dog具有play方法
}

public class test01 {
    public static void main(String[] args) {
        Animal b = new Dog(); // b 是 Animal 类型，但指向 Dog 对象

        //b的引用类型是Animal

        //当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，再去调用子类的同名方法。
        b.play();  //编译时检查 先检查Animal里面有无play()方法 运行时 jvm调用的时Dog继承下来的play方法
        Dog a=(Dog) b;

        a.sleep();


    }
}
