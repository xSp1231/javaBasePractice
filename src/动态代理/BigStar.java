package 动态代理;

/**
 * @Author xushupeng
 * @Date 2024-12-13 18:05
 */
public class BigStar  implements Star{
    private String name;

    public BigStar(String name)
    {
        this.name = name;
    }
    @Override
    public String sing(String name){
        System.out.println(this.name+"is singing"+name);
        return "thank you";
    }
    @Override
    public void dance(String name){
        System.out.println(this.name+"is dancing"+name);
    }

}
