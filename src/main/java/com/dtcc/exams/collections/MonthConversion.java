package com.dtcc.exams.collections;


import java.util.HashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {

    public Map<Integer,String> map=new HashMap<>();

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
            map.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        if(map.get(monthNumber)!=null) {
            if(map.containsKey(monthNumber)){
                return map.get(monthNumber); //{throw new NullPointerException();}
            }else return null;
        }else return null;
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Integer key = null;
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            if(entry.getValue().equals(monthName)){
                key =entry.getKey();
            }
        }
        return key;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return map.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return map.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return map.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
            if(map.containsKey(monthNumber)){
                map.replace(monthNumber,monthName);
            }
    }
}
