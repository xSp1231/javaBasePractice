package customGeneric;

import Result.R;

/**
 * @Author xushupeng
 * @Date 2023-08-27 18:58
 */
public class CustomGeneric {

}
//自定义泛型  泛型标识符可以有多个
//普通成员可以使用泛型 （属性 方法）
class Tiger<R,M,T>{
    String name;  //属性使用到泛型
    R r;
    M m;
    T t;
    //T[] t=new T[10]   报错  因为不知道类型是什么  所以不可以初始化 开辟空间
//    public static void m1(M m){ //静态方法 也不能使用泛型  因为静态方法在类加载的时候（类加载的时候 对象还没有创建）就已经加载了。此时还没有实例化对象
//   }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() { //方法的返回类型使用到泛型
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
