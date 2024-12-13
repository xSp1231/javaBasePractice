package generic;

import java.util.ArrayList;

/**
 * @Author xushupeng
 * @Date 2023-08-27 15:26
 */

//使用泛型
public class Generic02 {
    //使用泛型
    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList<>(); //arrayList里面放的是object(未使用泛型)
        arrayList.add(new Dog("旺财",1));
        arrayList.add(new Dog("发财",2));
      //   arrayList.add(new Cat("mao猫",1)); 报错
        //遍历的时候 直接使用dog
        for(Dog dog :arrayList){
            System.out.println(dog.getName());
        }


    }


}