package thread;

/**
 * @Author xushupeng
 * @Date 2023-08-28 11:10
 */
public class ThreadTest {
    public static void main(String[] args) {//main方法 开启一个主线程
        Dog dog = new Dog();  //dog  cat 为线程对象 当调用start方法 就开启了多线程
        Cat cat = new Cat();
        dog.start();//开启一个子线程    //
        cat.start();//开启一个子线程    6`·····//
//        Horse horse1=new Horse("H1");
//        Horse horse2=new Horse("H2");
//        horse1.start();
//        horse2.start();
    }
}
class Horse extends Thread{
    private String  name;
    public Horse(String name){
        this.name=name;
    }
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(name+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Dog extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("dog"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Cat extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("Cat"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
