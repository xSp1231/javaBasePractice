import Result.R;

import java.util.List;
import java.util.Objects;


class People{
    @Override
    public boolean equals(Object o) {
        // 检查引用相等
        if (this == o) return true;
        // 检查类型
        if (o == null || getClass() != o.getClass()) return false;

        People people = (People) o; // 强制转换

        // 比较name和age
        return Objects.equals(name, people.name) && Objects.equals(age, people.age);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    private String name;
    private Integer age;

    static int count=0;
    static {

        System.out.println("静态代码块执行");
    }

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
 public People(String name,Integer age){
        count++;
     System.out.println("构造方法执行"+count);
 }

}
public class resultReBackTest {

    public static void main(String[] args) {
//        System.out.println(new R(true,"200","data","success"));
//        System.out.println(new R(false,"data"));
//        int a=6;
//        int b=++a; //先增 再赋值
//        System.out.println(a);
//        System.out.println(b);
        People p1=new People("xsp",22);
        People p2=new People("xsp",22);
        System.out.println(p1.equals(p2));// 对象比较  ==比较内存地址   而equals比较的是内容
        String str1="xsp";
        String str2=new String("xsp");
        System.out.println(str1==str2);

    }
}
