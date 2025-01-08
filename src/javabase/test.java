package javabase;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author forerunner
 * @Date 2025-01-06 16:34
 */


public class test {
    public static void main(String []args){
        List<Integer> list=new ArrayList<>();

        Double a=1.0;
        Double b=2.0;
        System.out.println(Double.compare(a,b));

    }

    public static<E,T>  E  ttt(E num, T arg){
        System.out.println(num.getClass());
        System.out.println(arg.getClass());
        return num;
    }

    public static void printArray(String name,int... numbers) {
        System.out.println("name is "+name);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
