package com.dtcc.exams.collections;

import java.util.*;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */
     List<String> strings;
     Integer itemQuantity;
    public Inventory(List<String> strings) {
        this.strings = strings;
        this.itemQuantity = strings.size();
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
        this.strings.add(item);
        this.itemQuantity = strings.size();
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        strings.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
       if(strings.contains(item)){

       }
        return this.itemQuantity;
    }
}
