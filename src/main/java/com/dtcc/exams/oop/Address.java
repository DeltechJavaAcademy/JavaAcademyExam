package com.dtcc.exams.oop;

import java.util.Objects;

public class Address {

    public String addressLine1;
    public String addressLine2;
    public String City;
    public String State;
    public String zipCode;

    public Address() {
        this(null,null,null,null,null);
    }

    public Address(String one){
        this(null,null,null,null,null);
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.setAddressLine1(Objects.toString(addressLine1, ""));
        this.setAddressLine2(Objects.toString(addressLine2, ""));
        this.setCity(Objects.toString(city, ""));
        this.setState(Objects.toString(state, ""));
        this.setZipcode(Objects.toString(zipcode, ""));
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;

    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        this.State = state;
    }

    public String getZipcode() {
        return zipCode;
    }

    public void setZipcode(String zipcode) {
        this.zipCode = zipcode;
    }

    //"Address{addressLine1='123 Gitlabs', addressLine2='', city='New Castle', state='Delaware', zipcode='19720'}";
    public String toString(){
        String temp = "Address{";
        temp += "addressLine1='" + Objects.toString(getAddressLine1(), "") +"', ";
        temp += "addressLine2='" + Objects.toString(getAddressLine2(), "") +"', ";
        temp += "city='" + Objects.toString(getCity(), "") +"', ";
        temp += "state='" + Objects.toString(getState(), "") +"', ";
        temp += "zipcode='" + Objects.toString(getZipcode(), "")+ "'}";
        return temp;
    }

    @Override
    public boolean equals(Object o) {
           return this.toString().equals(o.toString());
    }
}
