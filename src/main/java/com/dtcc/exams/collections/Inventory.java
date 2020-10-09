package com.dtcc.exams.collections;

import java.util.ArrayList;
import java.util.List;

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
        this.strings=strings;
        this.itemQuantity=strings.size();
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this(new ArrayList<String>());
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        this.strings.add(item);
        this.itemQuantity=strings.size();
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        if(strings!=null) {
            strings.remove(item);
            this.itemQuantity=strings.size();
        }
    }

    public List<String> getStrings() {
        return this.strings;
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
