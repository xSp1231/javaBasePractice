package ThreadExcerise;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Random;

/**
 * @Author xushupeng
 * @Date 2023-09-03 17:21
 */
public class Excerise01 {
    public static void main(String[] args) {



    }
}

class A implements Runnable{
    private boolean loop=true;
    @Override
    public void run() {
        while(true){
            System.out.println(Math.random()*100+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

