package com.dtcc.exams.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Use a map to solve
 */
public class MonthConversion {

    public Map<Integer, String> conversion = new HashMap<>();
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        conversion.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        return conversion.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Integer monthNumber = 0;
        for(Map.Entry m: conversion.entrySet()){
           if((m.getValue().equals(monthName))){
               monthNumber = (Integer)m.getKey();
               return monthNumber;
           }
        }
        return null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return conversion.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
       boolean temp = false;
        for(Map.Entry m: conversion.entrySet()){
            if((m.getValue().equals(monthName))){
               return true;
            }
        }
        return temp;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return conversion.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        if(conversion.containsKey(monthNumber)){
            conversion.replace(monthNumber, monthName);
        }else{
            conversion.put(monthNumber,monthName);
        }
    }
}
