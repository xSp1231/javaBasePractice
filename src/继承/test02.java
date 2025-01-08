package 继承;

import opp.student;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xushupeng
 * @Date 2024-12-29 14:38
 */

class Person {
    private String name;
    private int age;

    // 父类构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 获取个人信息
    public String getInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Senior extends Person {
    private List<String> subjects=new ArrayList<>();

    // 子类构造方法
    public Senior(String name, int age) {
        super(name, age); // 调用父类构造方法

    }

    // 添加学科
    public void addSubject(String subject) {
        subjects.add(subject);
    }

    // 获取学生信息
    @Override
    public String getInfo() {
        System.out.println("Senior"+subjects);
        return super.getInfo() + ", Subjects: " + subjects;
    }
}
public class test02 {

    public static void main(String[] args) {
            // 创建学生对象
            Senior student = new Senior("Alice", 20);
            student.addSubject("Math");
            student.addSubject("java");
            student.addSubject("python");
            student.addSubject("web");
            List<String> lis = new ArrayList<>();
            lis.add("xsp");
            lis.add("xsp");
            lis.add("xsp");
            System.out.println(lis);
            // 输出学生信息
            System.out.println(student.getInfo());
        }

}
