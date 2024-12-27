package 枚举类;

/**
 * @Author xushupeng
 * @Date 2024-12-26 15:22
 */
public class EnumTest {

    public static void judgeOrder(OrderStatus status){
        switch (status){
            case PENDING:
                System.out.println("待支付");
                break;
            case PAID:
                System.out.println("已支付");
                break;
            case SHIPPED:
                System.out.println("已发货");
                break;
            case DELIVERED:
                System.out.println("已收货");
                break;
            default:
                System.out.println("无效订单");
        }
    }

    public static void main(String[] args) {


        OrderStatus status = OrderStatus.PAID;  //枚举类中实例唯一
        System.out.println(status.hashCode()); //123
        System.out.println(OrderStatus.PAID.hashCode()); //123
        System.out.println(status);

        judgeOrder(status);



    }



}
