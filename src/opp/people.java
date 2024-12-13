package opp;

public class people {
    public String name;
    private int age;
    //构造方法重载
    public people(){
    }
    public people(String name,int age){
        this.name=name;
        this.age=age;
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

    public void say(){
        System.out.println("你好,我是people");
    }
    public void intro(){
        System.out.println("我的姓名是"+this.name+"我的年纪是"+this.age);
    }

}
