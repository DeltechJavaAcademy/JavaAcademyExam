package com.dtcc.exams.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    Map<Integer, String> months = new HashMap<>();

    public void add(Integer monthNumber, String monthName) {
       months.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
//        throw new NullPointerException();
        return months.get(monthNumber);


    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        for (Map.Entry entry : months.entrySet()) {
            if (entry.getValue().equals(monthName)) {
                return (Integer) entry.getKey();
            }
        }
        return null;
    }


    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        if(months.containsKey(monthNumber)){
            return true;
        }
        return false;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        if(months.containsValue(monthName)){
            return true;
        }
        return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {

        return months.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        months.replace(monthNumber, monthName);

    }
}
