package com.dtcc.exams.oop;

/**
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    private Long id;
    private String name;
    private Address address;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = null;
        this.name = "";
        this.address = null;

    }

    public Person() {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        Person person2 = (Person)o;
        boolean flag = false;
        if(this.id == (person2.getId()) &&
                this.name.equals(person2.getName()) &&
                this.address.equals(person2.getAddress())){
            flag = true;
        }
        return flag;
    }
}