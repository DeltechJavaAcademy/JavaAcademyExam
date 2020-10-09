package com.dtcc.exams.oop;

import java.util.Objects;

/**
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person extends Address{
    Long ID;
    String Name;
    Address Address;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.ID = id;
        this.Name = name;
        this.setAddress(address);
    }

    public Person() {
        this(null, null, new Address());
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
        return Address;
    }

    public void setAddress(Address address) {
        this.setAddressLine1(address.getAddressLine1());
        this.setAddressLine2(address.getAddressLine2());
        this.setCity(address.getCity());
        this.setState(address.getState());
        this.setZipcode(address.getZipcode());
    }

    @Override
    public boolean equals(Object o) {
         return (this.getId() == ((Person)o).getId())
                 && (this.getName().equals(((Person) o).getName()));
    }
}