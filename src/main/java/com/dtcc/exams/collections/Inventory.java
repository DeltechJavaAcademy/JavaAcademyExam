package com.dtcc.exams.collections;

import java.util.HashMap;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    HashMap<String, Integer> inventory= new HashMap<>();
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        for(int i = 0; i< strings.size(); i++){
            if(this.inventory.containsKey(strings.get(i))){
                int j = this.inventory.get(strings.get(i)) + 1;
                this.inventory.put(strings.get(i), j);
            }
            else{
                this.inventory.put(strings.get(i), 1);
            }
        }
        this.inventory = inventory;
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if(this.inventory.containsKey(item)){
            int quantity = this.inventory.get(item);
            this.inventory.put(item, quantity +1);
        }
        else {
            this.inventory.put(item, 1);
        }
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        if(this.inventory.containsKey(item)){
            this.inventory.put(item, this.inventory.get(item) -1);
        }
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        int quantity = 0;
        if(this.inventory.containsKey(item)){
            quantity = this.inventory.get(item);
        }
        return quantity;
    }
}
