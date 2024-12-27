package 枚举类;

/**
 * @Author xushupeng
 * @Date 2024-12-26 15:20
 */
public enum OrderStatus {
    PENDING("待支付",0),
    PAID("已支付",1),
    SHIPPED("已发货",2),
    DELIVERED("已收货",3);

    private String description;

    private  int state;
    OrderStatus(String description,int state) {
        this.description = description;
        this.state = state;
    }

    public String getDescription() {
        return description;
    }
    public int getState() {
        return state;
    }
}
