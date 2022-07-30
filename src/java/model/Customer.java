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
public class Customer {
    private int cus_id;
    private String cus_name;
    private String cus_phone;
    private String cus_address;
    private Account cus_account;

    public Customer() {
    }

    public Customer(int cus_id, String cus_name, String cus_phone, String cus_address, Account cus_account) {
        this.cus_id = cus_id;
        this.cus_name = cus_name;
        this.cus_phone = cus_phone;
        this.cus_address = cus_address;
        this.cus_account = cus_account;
    }

    public int getCus_id() {
        return cus_id;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getCus_phone() {
        return cus_phone;
    }

    public void setCus_phone(String cus_phone) {
        this.cus_phone = cus_phone;
    }

    public String getCus_address() {
        return cus_address;
    }

    public void setCus_address(String cus_address) {
        this.cus_address = cus_address;
    }

    public Account getCus_account() {
        return cus_account;
    }

    public void setCus_account(Account cus_account) {
        this.cus_account = cus_account;
    }
    
    
}
