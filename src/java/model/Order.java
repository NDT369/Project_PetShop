/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DUC THINH
 */
public class Order {
    private int order_id;
    private int cus_id;
    private String order_date;
    private double totalMoney;

    public Order() {
    }

    public Order(int order_id, int cus_id, String order_date, double totalMoney) {
        this.order_id = order_id;
        this.cus_id = cus_id;
        this.order_date = order_date;
        this.totalMoney = totalMoney;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getCus_id() {
        return cus_id;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }
    
    
}
