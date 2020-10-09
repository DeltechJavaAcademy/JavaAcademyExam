package com.dtcc.exams.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {

    Map<String, Integer> Invent = new HashMap<String, Integer>();

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        for (String item: strings) {
            if(Invent.containsKey(item)){
                Invent.put(item, Invent.get(item) + 1);
            } else {
                Invent.put(item, 1);
            }
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() { }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if(Invent.containsKey(item)){
            Invent.put(item, Invent.get(item) + 1);
        } else {
            Invent.put(item, 1);
        }
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        if(Invent.containsKey(item)){
            Invent.put(item, Invent.get(item) - 1);
    }else if (!Invent.containsKey(item)){
            //Invent.remove(item, -1);
        }
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        if (this.Invent.containsKey(item)) {
            return this.Invent.get(item);
        } else {
            return 0;
        }
    }
}
