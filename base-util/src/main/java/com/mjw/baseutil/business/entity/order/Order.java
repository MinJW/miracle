package com.mjw.baseutil.business.entity.order;

import java.io.Serializable;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/5/8 15:03
 * @Version 1.0.0
 **/
public class Order implements Serializable {

    private static final long serialVersionUID = -6928224283122911191L;

    private Long orderId;
    private String orderName;
    private Double orderPrice;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }
}
