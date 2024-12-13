package generic;

/**
 * @Author xushupeng
 * @Date 2023-08-27 17:20
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 创建一个 List，用于存储对象
        List<People> list = new ArrayList<>();

        // 添加一些对象
        list.add(new People("John", 25));
        list.add(new People("Alice", 30));
        list.add(new People("Bob", 29));
        list.add(new People("Bob", 97));
        list.add(new People("Bob", 33));

        // 使用自定义排序规则对 List 进行排序
        list.sort(new AgeComparator());

        // 打印排序后的结果
        for (People people : list) {
            System.out.println(people);
        }
    }
}

// 自定义对象，用于演示排序
class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// 自定义比较器，按照年龄进行排序
class AgeComparator implements Comparator<People> {
    @Override
    public int compare(People p1, People p2) {
        if (p1.getAge() >= p2.getAge()) {
            return -1; //表示第一个对象的值大于第二个对象的值   那么就是升序
        } else {
            return 1;
        }
//        if (p1.getAge()>p2.getAge()){
//            return 1;
//        }
//        else{
//            return 0;
//        }
    }
}