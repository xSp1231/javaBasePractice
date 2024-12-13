package generic;

import java.awt.*;
import java.util.ArrayList;

/**
 * @Author xushupeng
 * @Date 2023-08-27 15:10
 */

//未使用泛型
public class Generic01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(); //arrayList里面放的是object(未使用泛型)
        arrayList.add(new Dog("旺财",1));
        arrayList.add(new Dog("发财",2));
        arrayList.add(new Cat("mao猫",1));
        for (Object ob:arrayList){
            //向下转型
            Dog dog=(Dog) ob;
            System.out.println(dog.getName());

        }



    }


}
class Dog{
private String name;
private int age;
public Dog(String name,int age){
    this.name=name;
    this.age=age;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Cat{
    private String name;
    private int age;
    public Cat(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}