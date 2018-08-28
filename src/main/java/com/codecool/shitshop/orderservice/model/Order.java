package com.codecool.shitshop.orderservice.model;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@Table(foreignKey = "orderId")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @OneToOne
    private Long orderId;

    private Long userId;

    private Date date;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
