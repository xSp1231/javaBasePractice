package thread;

/**
 * @Author xushupeng
 * @Date 2023-08-28 21:24
 * 实现接口 实现线程
 */
public class RunnableTest {
    public static void main(String[] args) throws InterruptedException {
//             C c=new B();
//             c.say();

        T t = new T();
        //开启子线程
        //创建thread对象 将t对象（实现了runnable方法）放入
        Thread thread = new Thread(t);
        thread.start();

        for(int i=1;i<=10;i++){
            Thread.sleep(1000);
            System.out.println("i "+i);
        }

    }
}
class T implements Runnable{
    int count=0;
    @Override
    public void run(){
        while(true){
            System.out.println("TTT"+count+" "+Thread.currentThread().getName()); //线程名称
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            if(count==10){
                System.out.println("退出");
                break;
            }
        }

    }
}
interface C {
    void say();
}


class A implements C{

    @Override
    public void say() {
        System.out.println("AAAAAA");

    }
}
class B implements C{

    @Override
    public void say() {
        System.out.println("BBBBBB");


    }
}
