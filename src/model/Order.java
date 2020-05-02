package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String consumerName;
    private Date date;
    private OrderStatus orderStatus;
    private boolean isCash;
    private List<OrderItem> orderItems;

    public Order(String consumerName) {
        this.consumerName = consumerName;
        this.date = new Date();
        this.orderItems = new ArrayList<>();
        this.orderStatus = OrderStatus.CREATED;
    }

    public String getConsumerName() {
        return consumerName;
    }
    public Date getDate() {
        return date;
    }
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
    public boolean isCash() {
        return isCash;
    }
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
    public void setCash(boolean cash) {
        this.isCash = cash;
    }
}
