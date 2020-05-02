package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermarket {
    private static Supermarket instance = new Supermarket();
    private Map<String, Good> goods;
    private List<Order> orders;

    private Supermarket() {
        this.goods = new HashMap<>();
        this.orders = new ArrayList<>();
    }

    public static Supermarket getInstance() {
        if (instance == null) {
            instance = new Supermarket();
        }
        return instance;
    }
    public Map<String, Good> getGoods() {
        return goods;
    }
    public List<Order> getOrders() {
        return orders;
    }

}
