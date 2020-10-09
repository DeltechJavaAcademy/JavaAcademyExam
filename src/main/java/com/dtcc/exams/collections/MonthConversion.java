package com.dtcc.exams.collections;

import java.util.HashMap;
import java.util.Set;

/**
 * Use a map to solve
 */
public class MonthConversion {

    HashMap<Integer, String> conversionMap = new HashMap<>();
    /**
   //  * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
   //  * @param monthName - name of month
     */

    public MonthConversion(){
        this.conversionMap = conversionMap;
    }

    public void add(Integer monthNumber, String monthName) {
        this.conversionMap.put(monthNumber, monthName);
    }



    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        String monthName = null;
        if(this.conversionMap.containsKey(monthNumber)){
            monthName = this.conversionMap.get(monthNumber);
        }
//        else{
//            throw new NullPointerException();
//        }
        return monthName;
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Set<Integer> keys = this.conversionMap.keySet();
        Integer numberResult = null;
        for(Integer number : keys){
            if(this.conversionMap.get(number).equals(monthName)){
                numberResult = number;
            }
        }
        return numberResult;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        boolean flag = false;
        if(this.conversionMap.containsKey(monthNumber)){
            flag = true;
        }
        return flag;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        boolean flag = false;
        Set<Integer> keys = this.conversionMap.keySet();
        for(Integer number : keys){
            if(this.conversionMap.get(number).equals(monthName)){
                flag = true;
            }
        }
        return flag;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        int size = 0;
        Set keys = this.conversionMap.keySet();
        size = keys.size();
        return size;
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        this.conversionMap.put(monthNumber, monthName);
    }
}
