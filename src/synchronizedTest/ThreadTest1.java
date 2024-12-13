package synchronizedTest;
/**
 * @Author xushupeng
 * @Date 2023-09-03 15:49
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        Seller seller = new Seller();
        Thread t1 = new Thread(seller);
        Thread t2 = new Thread(seller);
        Thread t3 = new Thread(seller);
        t1.start();
        t2.start();
        t3.start();
    }
}
//线程同步解决售票问题   使用synchronized
class Seller implements Runnable {
    private static int  num=100;//共享变量  多线程共享
    private static boolean  loop=true;//共享变量  多线程共享
    public  void  sell(){//同步方法，在同一时刻 只可以有一个线程执行sell方法    也可以在代码块里面加锁
        synchronized (this){ //代码块加锁   同步代码块  同一时刻 只能一个线程访问
        if(num<=0){
            System.out.println("售罄");
            loop=false;
            return;
        }
        num-=1;
        System.out.println(Thread.currentThread().getName()+"售出票  剩下"+(num));
        try {
            Thread.sleep(10);
         } catch (InterruptedException e) {
            throw new RuntimeException(e);
         }
        }
    }
    @Override
    public  void run() { //多个线程可以同时使用这个方法
        while (true){
        sell();//同一时候 只能有一个   一个线程卖一次 之后又是另外的线程运行
        if(!loop){
            break;
        }
       }
    }
}