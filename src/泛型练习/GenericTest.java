package 泛型练习;

import sun.reflect.generics.tree.ReturnType;

/**
 * @Author xushupeng
 * @Date 2024-12-27 16:29
 */

class Result<T>{
    private  int code;
    private  String msg;
    private T data;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

//    泛型方法必须在方法声明中加上 <T> 以声明泛型类型。这是为了让编译器知道这个方法可以接受和返回任何类型的参数，而不仅仅是特定的类型。
//
//    泛型方法的声明
//    当你定义一个泛型方法时，<T> 应该放在返回类型之前。例如：
//public static <T, U> ReturnType methodName(T param1, U param2) {
//    // 方法体
//}
    public static <T>  Result<T> success(T data){
        Result<T> result=new Result<>();
        result.setCode(666);
        result.setMsg("success");
        result.setData(data);
        return result;
    }

    public static  <T> Result<T> error(T data){
        Result<T> result=new Result<>();
        result.setCode(500);
        result.setMsg("error");
        result.setData(data);
        return result;
    }

}

class User{
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class GenericTest {
    public static void main(String[] args) {
      Result<String>result=new Result<>();
      result.setCode(200);
      result.setMsg("success");
      result.setData("hello world");
      System.out.println("result is "+result);

      User user=new User("xsp",22);
      System.out.println(Result.success(user));

    }

}
