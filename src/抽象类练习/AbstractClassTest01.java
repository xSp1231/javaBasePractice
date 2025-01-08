package 抽象类练习;

/**
 * @Author xushupeng
 * @Date 2024-12-04 21:54
 */
//1. 抽象类不能被实例化(初学者很容易犯的错)，如果被实例化，就会报错，编译无法通过。只有抽象类的非抽象子类可以创建对象。
//
//        2. 抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
//
//        3. 抽象类中的抽象方法只是声明，不包含方法体，就是不给出方法的具体实现也就是方法的具体功能。
//
//        4. 构造方法，类方法（用 static 修饰的方法）不能声明为抽象方法。
//
//        5. 抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类。
abstract class Person { //抽象类可以有构造方法 可以有成员变量
    public Person(String name) {
        System.out.println("abstract");
        this.name = name;
    }

    private String name;

    public abstract void play();
    public void eat() {
        System.out.println("人吃饭");
    }
}
class Worker extends Person {
    private int salary;
    public Worker(String name, int salary) {
        super(name);
        this.salary = salary;
    }
    public void play() {
        System.out.println("打游戏");
    }
}



public class AbstractClassTest01 {
    public static void main(String[] args) {
        Worker worker = new Worker("xsp", 10000);
        worker.play();
        worker.eat();
    }
}
