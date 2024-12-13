package opp;

public class student extends people{
 public student(String name,int age){
     super(name,age);
 }
 public void say(){
     System.out.println("我是学生");
 }
 public void intro(){
     System.out.println("name"+name);
 }
}
