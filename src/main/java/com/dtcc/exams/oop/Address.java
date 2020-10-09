package com.dtcc.exams.oop;

public class Address {

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipcode;

    public Address() {

        this.addressLine1 = "";
        this.addressLine2= "";
        this.city= "";
        this.state= "";
        this.zipcode= "";
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
    }

    public String getAddressLine1() {
        return null;
    }

    public void setAddressLine1(String addressLine1) {
    }

    public String getAddressLine2() {
        return null;
    }

    public void setAddressLine2(String addressLine2) {
    }

    public String getCity() {
        return null;
    }

    public void setCity(String city) {
    }

    public String getState() {
        return null;
    }

    public void setState(String state) {
    }

    public String getZipcode() {
        return null;
    }

    public void setZipcode(String zipcode) {
    }

    @Override
    public boolean equals(Object o) {
        if (this.addressLine1 == ((Address)o).addressLine1 && this.addressLine2 == ((Address)o).addressLine2 &&
        this.city == ((Address) o).city  && this.state == ((Address) o).state &&
                this.zipcode == ((Address) o).zipcode){
            return true;
        }
        return  false;
    }
}
