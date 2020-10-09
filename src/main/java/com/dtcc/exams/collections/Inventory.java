package com.dtcc.exams.collections;

import java.util.*;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    Map<Integer, List<String>> inventory = new HashMap<>();
    public Inventory(List<String> strings) {

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
        //List<String> inventoryList = inventory.get(item);
        if(inventory.containsKey(item)){
           // inventory.(item);
        }
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

        inventory.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
       // Integer
        return null;//inventory.get(item);
    }
}
