package thread;

/**
 * @Author xushupeng
 * @Date 2023-08-29 13:27
 */
//售票问题 三个窗口售票
public class ThreadTest1 {
    public static void main(String[] args) {
//实现thread类
//        Seller1 s1 = new Seller1();
//        Seller1 s2 = new Seller1();
//        Seller1 s3 = new Seller1();
//        s1.start();
//        s2.start();
//        s3.start();
     //实现接口
        Seller2 s = new Seller2();
        //同一个对象
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();

    }
}
class Seller1 extends Thread {
    private static int  num=100;//共享变量  多线程共享
    @Override
    public void run() {
        while(true){
            if(num<=0){
                System.out.println("售罄");
                break;
            }
            num-=1;
            System.out.println(Thread.currentThread().getName()+"售出票  剩下"+(num));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Seller2 implements Runnable{
    private static int  num=100;//共享变量  多线程共享
    @Override
    public void run() {
        while(true){
            if(num<=0){
                System.out.println("售罄");
                break;
            }
            num-=1;
            System.out.println(Thread.currentThread().getName()+"售出票  剩下"+(num));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
