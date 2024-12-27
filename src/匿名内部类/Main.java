package 匿名内部类;

/**
 * @Author xushupeng
 * @Date 2024-12-14 20:21
 */
import java.util.Arrays;
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

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        };

        // 使用匿名内部类进行排序
        Arrays.sort(people, new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age);
            }

//                创建匿名内部类：
//                new Greeting() 表示我们正在创建一个实现 Greeting 接口的匿名内部类。
//                在 {} 内部，我们定义了这个类的方法实现。

        }
        );

        // 输出排序后的结果
        for (Person person : people) {
            System.out.println(person);
        }
    }
}