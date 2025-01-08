package Character;

/**
 * @Author xushupeng
 * @Date 2024-12-13 12:02
 */

class User{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void print(){
        System.out.println("name is "+name+" age is "+age);
    }

}

class Example {
    static int staticVar = 10;
    public int instanceVar = 20;
    static void staticMethod() {
        System.out.println("Static method called");
    }
}
public class test01 {


    public static void main(String[] args) {
        Example obj = null;
        System.out.println(obj.staticVar); // 输出 10
        obj.staticMethod(); // 调用静态方法
        System.out.println(obj.instanceVar);
//     StringBuffer a = new StringBuffer("Runoob");
//     StringBuffer b = new StringBuffer("Google");
//     a.delete(1,3);
//     a.append(b);
//     System.out.println(a);

//     String s1 = "runoob";
//     String s2 = "runoob";
//     System.out.println("s1 == s2 is:" + s1 == s2);

        int x = 3;
        int y = 999;
//        赋值操作：x = y 会将 y 的值（即 1）赋值给 x。此时，x 的值将变为 1。
//        返回值：赋值表达式在 Java 中会返回被赋的值，因此 x = y 返回 1。
//        System.out.println(x = y); //返回999

//        float a=1f;
//        double b=2.11d;
//        Double c=11.11;
//        System.out.println(b);


//        char a=97;
//        System.out.println(a); //a
//        System.out.println(Math.round(3.7));
        printer();

        User user = new User();
        user.print();

    }


    static void printer(){
        int a=1; //局部变量必须实例化
        System.out.println("a is "+a);
    }

}
