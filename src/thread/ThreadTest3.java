package thread;

/**
 * @Author xushupeng
 * @Date 2023-09-03 15:26
 */
public class ThreadTest3 {
    public static void main(String[] args) throws InterruptedException {
        TT t = new TT();
        System.out.println(t.getState());
        //t.start();
        //System.out.println(t.getState());
        for(int i=1;i<=10;i++){
            System.out.println("主线程"+i);
            Thread.sleep(700);
            if(i==4){
                t.start();
                t.join();//让子线程先执行
            }
        }

        while(true){
            System.out.println("状态 "+t.getState());
            Thread.sleep(500);
        }
    }
}
class TT extends Thread{
    @Override
    public void run() {
    for (int i=1;i<=6;i++){
        System.out.println("子线程"+i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }
}

