package 匿名内部类;

/**
 * @Author xushupeng
 * @Date 2024-12-14 20:21
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

class Cmp implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.age, p2.age);//p1.age>p2.age 返回正 p1放到后面 所以是从小到大排序
    }
}

//        Comparator<Person> cmp = new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                return Integer.compare(p1.age, p2.age);
//            }
//        };
public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        };
//                创建匿名内部类：
//                new Greeting() 表示我们正在创建一个实现 Greeting 接口的匿名内部类。返回一个实例对象
//                在 {} 内部，我们定义了这个类的方法实现。
//                使用匿名内部类进行排序

//        父类 对象 = new 父类（）{   重写父类中的方法   }；
//        接口 对象=new 接口（）{ 重写接口中的方法 }；

        Cmp cmp = new Cmp();
//        Arrays.sort(people, cmp); //正确

        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return Integer.compare(person.age, t1.age); //从小到大排序
            }
        });

//如果 p1.age 小于 p2.age，返回一个负值（表示 p1 在排序中应该排在 p2 前面）。
//如果 p1.age 等于 p2.age，返回 0（表示它们在排序中相等）。
//如果 p1.age 大于 p2.age，返回一个正值（表示 p1 在排序中应该排在 p2 后面）

        // 输出排序后的结果
        for (Person person : people) {
            System.out.println(person);
        }
    }
}