package com.cn.myself.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaolin.zhang on 2017/3/1.
 */
public class Order implements Serializable{
    private Customer customer;
    private List<Pizza> pizzas;
    private  Payment payment;

    public Order() {
        pizzas=new ArrayList<Pizza>();
        customer=new Customer();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
