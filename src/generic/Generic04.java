package generic;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.List;

/**
 * @Author xushupeng
 * @Date 2023-08-27 16:34
 */
public class Generic04 {
    public static void main(String[] args) {
//        A a = new A();
//        Pig<A> aPig = new Pig<A>(a);        //可以
//        Pig<A> aPig = new Pig<A>(new A());

        Pig<String> pig=new Pig<>("tom");
        pig.say();


    }
}
class A{}
class B {}

class Pig<E>{
    E s;
    public Pig(E s){
        this.s=s;
    }
    void say(){
        System.out.println("s is "+s);
    }



}
