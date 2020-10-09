package com.dtcc.exams.oop;

import java.util.Objects;

/**
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person extends Address{
    Long ID;
    String Name;
    Address address;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        if(id == null){
            this.ID = Long.MIN_VALUE;
        }else{
            this.ID = id;
        }
        this.Name = name;
        this.address = address;
    }

    public Person() {
        this.ID = Long.MIN_VALUE;
        this.Name = "";
        this.address = new Address();
    }

    public Long getId() {
        return ID;
    }
    public void setId(Long id) {this.ID = id; }
    public String getName() {
        return Name;
    }
    public void setName(String name) {this.Name = name;}

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.setAddressLine1(address.getAddressLine1());
        this.setAddressLine2(address.getAddressLine2());
        this.setCity(address.getCity());
        this.setState(address.getState());
        this.setZipcode(address.getZipcode());
    }

    //Person{id=9223372036854775807, name='PersonName', address=Address{addressLine1='line1', addressLine2='line2', city='city', state='state', zipcode='99999'}}"
    public String toString(){
        Address address = Person.this.getAddress();
        String temp = "Person{";
        temp += "id=" + Objects.toString(getId(), "") + ", ";
        temp += "name='" + Objects.toString(getName(), "") + "', ";
        temp+= "address=";
        temp += "Address{";
        temp += "addressLine1='" + Objects.toString(address.getAddressLine1(), "") +"', ";
        temp += "addressLine2='" + Objects.toString(address.getAddressLine2(), "") +"', ";
        temp += "city='" + Objects.toString(address.getCity(), "") +"', ";
        temp += "state='" + Objects.toString(address.getState(), "") +"', ";
        temp += "zipcode='" + Objects.toString(address.getZipcode(), "")+ "'}}";
        return temp;
    }

    @Override
    public boolean equals(Object o) {
         return (this.toString().equals(o.toString()));
    }
}