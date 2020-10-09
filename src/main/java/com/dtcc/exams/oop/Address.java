package com.dtcc.exams.oop;

public class Address {

    String addressLine1;
    String addressLine2;
    String city;
    String state;
    String zipcode;

    public Address() {
        this.addressLine1 = "";
        this.addressLine2 = "";
        this.city = "";
        this.state = "";
        this.zipcode = "";
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        String addressString = "Address{addressLine1='" + this.addressLine1 + "', addressLine2='" + this.addressLine2 + "', city='" + this.city + "', state='" + this.state + "', zipcode='" + this.zipcode + "'}";
        return addressString;
    }

    @Override
    public boolean equals(Object o) {
        Address address2 = (Address)o;
        boolean flag = false;
        if(this.state.equals(address2.getState()) &&
                this.city.equals(address2.getCity()) &&
                this.addressLine2.equals(address2.getAddressLine2()) &&
                this.addressLine1.equals(address2.getAddressLine1()) &&
                this.zipcode.equals(address2.getZipcode())){
            flag = true;
        }

        return flag;
    }
}
