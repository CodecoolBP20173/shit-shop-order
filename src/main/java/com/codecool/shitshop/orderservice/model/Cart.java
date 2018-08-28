package com.codecool.shitshop.orderservice.model;

import org.hibernate.annotations.Table;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(foreignKey = "orderId")
public class Cart {

//    @OneToOne
    private Long orderId;
//
////    @ElementCollection
////    private List<String> products = new ArrayList<>();
//
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

//    @Bean
//    public List<String> getProducts() {
//        return products;
//    }
//
//    public void setProducts(List<String> products) {
//        this.products = products;
//    }
}
