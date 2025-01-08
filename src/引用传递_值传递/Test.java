package 引用传递_值传递;

/**
 * @Author forerunner
 * @Date 2025-01-08 14:49
 */
class Student{
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class Test {
    public static void main(String[] args) {
        int score=10;
        System.out.println(" before score="+score);
        change(score);
        System.out.println(" after score="+score);
        Student s=new Student("张三", 20); //这是引用数据类型 传递过来的是引用
        System.out.println("Student address is "+s.hashCode());

        System.out.println(" before s="+s);
        change(s);
        System.out.println(" after s="+s);
        String s1="hello";
        System.out.println(" before s1="+s1);
        change(s1);
        System.out.println(" after s1="+s1);
        Integer t=10;

        System.out.println(" before t="+t);
        change(t);
        System.out.println(" after t="+t);

        //重点 对于数组操作
        int[] arr={1,2,3,4,5};
        System.out.println(" before arr=");
        System.out.println("arr 地址 "+arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        change(arr);
        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void change(int score){ //对于8中基本数据类型 传递的是副本 不会改变原来的值
        score=100;
    }
    public static  void change(Student s){ //对于引用数据类型 传递的是引用
        System.out.println(" change Student address is "+s.hashCode());
        s.setAge(30);
        s.setName("forerunner");
    }
    public static void change(String s){ //但是对于String 和8中基本类型对应的包装类 则不能改变 因为源码中使用了final定义
        s="forerunner";
    }
    public static void change(Integer t){ //但是对于StringBuilder 则可以改变 因为源码没有使用final定义

           t=222;
    }
    public static void change(int[] arr){ //引用传递
        System.out.println("change arr 地址 "+arr);
        arr[0]=999;
        arr=null;
    }
    //引用传递也是一种值传递，并不会修改原来的引用的值，
    // 即 myArray 引用的值没有变化，还是和原来一样；
    // 但是由于引用传递传递的是引用数据在堆中的地址，
    // 因此可以通过引用传递修改引用数据类型在堆中的值，
    // 但是引用传递并不能修改原来的引用的值。



}
