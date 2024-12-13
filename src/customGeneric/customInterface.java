package customGeneric;

import Result.R;

/**
 * @Author xushupeng
 * @Date 2023-08-27 19:24
 */
public class customInterface {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.fun(78));

    }
}
class A implements IUsb<String,Integer>{
    @Override
    public String fun(Integer integer) {
        return integer.toString();
    }
}

interface IUsb<U,R>{
     U fun(R r);//方法中可以使用泛型
}
