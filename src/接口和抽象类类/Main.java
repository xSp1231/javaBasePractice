package 接口和抽象类类;

/**
 * @Author xushupeng
 * @Date 2024-12-15 11:16
 */

interface SpeakEnglish{
    void speak();
}
//教练为抽象类 具有 教方法     抽象类中也可以有具体方法
abstract class Coach{
    private String name;
    private int age;

    public Coach(String name,int age){
        this.name=name;
        this.age=age;
    }
    public abstract void teach();
}
//运动员英语怎么写

class PingPongCoach extends Coach implements SpeakEnglish{
    public PingPongCoach(String name,int age){
        super(name,age);
    }
    @Override
    public void teach() {
        System.out.println("pp球教练教乒乓球");
    }
    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
class BasketballCoach extends Coach{
    public BasketballCoach(String name,int age){
        super(name,age);
    }
    @Override
    public void teach() {
        System.out.println("教篮球");
    }
}

abstract class  Athlete{
     private String name;
     private int age;
    public Athlete(String name,int age){
        this.name=name;
        this.age=age;
    }
    public abstract void learn();
}
class PingPongAthlete extends Athlete implements SpeakEnglish{

    public PingPongAthlete(String name,int age){
        super(name,age);
    }
    @Override
    public void learn() {
        System.out.println("pp运动员 info is ");
        System.out.println("pp运动员学习乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("pp运动员学习说英语");
    }
}
class BasketballAthlete extends Athlete{
    public BasketballAthlete(String name,int age){
        super(name,age);
    }
    @Override
    public void learn() {
        System.out.println("basketball运动员学习篮球");
    }
}

public class Main {
    public static void main(String[] args) {
    PingPongAthlete pp=new PingPongAthlete("小明",18);
    pp.learn();
    pp.speak();
    BasketballAthlete bb=new BasketballAthlete("小红",19);
    bb.learn();

    PingPongCoach pc=new PingPongCoach("小明乒乓球教练",18);
    pc.teach();
    pc.speak();
    BasketballCoach bc=new BasketballCoach("小红篮球教练",18);
    bc.teach();
    System.out.println("--------------------------------");

    }


}
