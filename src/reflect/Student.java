package reflect;

/**
 * @Author xushupeng
 * @Date 2024-12-13 12:41
 */
public class Student {
    private String name;
    private int age;

    public int id;

    public Student() {}

    public Student(String name){
        this.name = name;
    }

    public Student(int age){
        this.age = age;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Student(String name, int age,int id){
        this.name = name;
        this.age = age;
        this.id = id;
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void info(){
        System.out.println("我是学生类");
    }

    //私有方法
    private void getSalary(){
        System.out.println("我是私有方法,salary 31k");
    }
}
