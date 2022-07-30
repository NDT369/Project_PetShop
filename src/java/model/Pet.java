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
public class Pet {
  private int pet_id;
  private String pet_name;
  private String pet_color;
  private String pet_sex;
  private String pet_age;
  private int pet_price;
  private String pet_img;
  private int quantity;
  private Category cate;

    public Pet() {
    }

    public Pet(int pet_id, String pet_name, String pet_color, String pet_sex, String pet_age, int pet_price, String pet_img, int quantity, Category cate) {
        this.pet_id = pet_id;
        this.pet_name = pet_name;
        this.pet_color = pet_color;
        this.pet_sex = pet_sex;
        this.pet_age = pet_age;
        this.pet_price = pet_price;
        this.pet_img = pet_img;
        this.quantity = quantity;
        this.cate = cate;
    }

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
    }

    public String getPet_name() {
        return pet_name;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public String getPet_color() {
        return pet_color;
    }

    public void setPet_color(String pet_color) {
        this.pet_color = pet_color;
    }

    public String getPet_sex() {
        return pet_sex;
    }

    public void setPet_sex(String pet_sex) {
        this.pet_sex = pet_sex;
    }

    public String getPet_age() {
        return pet_age;
    }

    public void setPet_age(String pet_age) {
        this.pet_age = pet_age;
    }

    public int getPet_price() {
        return pet_price;
    }

    public void setPet_price(int pet_price) {
        this.pet_price = pet_price;
    }

    public String getPet_img() {
        return pet_img;
    }

    public void setPet_img(String pet_img) {
        this.pet_img = pet_img;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCate() {
        return cate;
    }

    public void setCate(Category cate) {
        this.cate = cate;
    }

}
