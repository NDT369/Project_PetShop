/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUC THINH
 */
public class Cart {
    private List<Item> listItem;

    public Cart() {
        listItem = new ArrayList<>();
    }

    public Cart(List<Item> listItem) {
        this.listItem = listItem;
    }

    public List<Item> getListItem() {
        return listItem;
    }

    public void setListItem(List<Item> listItem) {
        this.listItem = listItem;
    }
    
    public Item getItemById(int petid){
        for(Item i : listItem){
            if(i.getPet().getPet_id()== petid){
                return i;
            }
        }
        return null;
    }
    
    public int getQuantityById(int petid){
        return getItemById(petid).getQuantity();
    }
    
    public void addItem(Item i){
        if(getItemById(i.getPet().getPet_id())!=null){
            Item item = getItemById(i.getPet().getPet_id());
            item.setQuantity(item.getQuantity()+i.getQuantity());
        }else{
            listItem.add(i);
        }
    }
    
    public void deleteItem(int petid){
        if(getItemById(petid)!=null){
            listItem.remove(getItemById(petid));
        }
    }
    
    public double getTotalMoney(){
        double money = 0;
        for(Item i:listItem){
            money += i.getPrice()*i.getQuantity();
        }
        return money;
    }
}
