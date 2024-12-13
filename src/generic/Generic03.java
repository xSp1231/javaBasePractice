package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @Author xushupeng
 * @Date 2023-08-27 15:51
 */
public class Generic03 {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("XSP");
        System.out.println(p1.f());
        p1.say();
        Person<Integer> p2 = new Person<>(111);
        System.out.println(p2.f());
        p2.say();
        HashSet<Dog> a = new HashSet<>();
        a.add(new Dog("旺财",11));
        a.add(new Dog("发财",22));
        System.out.println(a.size());
        for(Dog dog :a){
            System.out.println(dog);
        }
        List<HashMap<String, String >> lis=new ArrayList<>();
        HashMap<String, String > map = new HashMap<>();
        map.put("one","xsp");
        lis.add(map);
        System.out.println(lis);



    }
}
//泛型的作用 可以再类声明时通过一个标识表示类中某个属性的类型 。。。
class Person<E>{        //E 指代广泛的类型  该数据类型是在定义Person对象时指定的
 E  s;//E 表示数据类型
 public Person(E s){  //E 表示参数类型
     this.s=s;
 }
 public E f(){//E 表示返回类型
     return s;
 }
 public void say(){
     System.out.println("s 的数据类型是"+s.getClass());

 }



}