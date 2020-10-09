package com.dtcc.exams.collections;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Map<String, Integer> inventory;

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        inventory = new HashMap<>();
    }

    public Inventory(List<String> strings) {
        inventory = new HashMap<>();
        for(String item:strings){
            if(inventory.containsKey(item)){
                inventory.put(item,inventory.get(item) +1);
            }else{
                inventory.put(item, 1);
            }
        }
    }



    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        inventory.put(item, getItemQuantity(item) + 1);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        inventory.put(item, getItemQuantity(item)-1);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
           return inventory.getOrDefault(item, 0);
    }
}
