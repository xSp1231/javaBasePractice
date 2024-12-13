package 继承;

/**
 * @Author xushupeng
 * @Date 2024-12-12 20:23
 */
 class People{
    private String name;
    private int age;

    public People(String name ,int age){
        this.name=name;
        this.age=age;
    }

    public void  show(){
        System.out.println("我是父类");
        System.out.println("我是"+name+"今年"+age+"岁了");
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
        return "{ name="+name+"," +
                " age="+age+"}";
    }
}


class Student extends People{
    private int id;
    private String major;
    public Student(String name,int age,int id,String major){
        super(name,age);
        this.id=id;
        this.major=major;
    }
    //重写父类方法

    public void show(){
        super.show();
        System.out.println("我是子类");
        System.out.println("我是"+getName()+"今年"+getAge()+"岁了，学号是"+id+"，专业是"+major);
    }
    public void detail(){
        System.out.println("学生");
    }

}



public class test01 {
    public static void main(String[] args) {

//        String []s1=new String[]{"aaa"};
//        System.out.println(s1.length);
//        System.out.println(s1[0]);

        People p=new People("xsp",22);
        System.out.println(p);

        //继承
        Student s=new Student("xsp",22,111,"计算机");

        s.show();

        s.detail();


        //多态
        People t=new Student("xsp",22,111,"计算机");
        t.show(); //调用的应该是子类的show方法
        // t.detail(); 编译器会报错 因为t是People类型 People没有detail方法

        //如果想要使用t.detail() 需要向下转型
        if(t instanceof Student){
            Student stu=(Student) t;
            stu.detail();
        }



    }
}
