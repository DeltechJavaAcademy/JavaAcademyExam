package com.dtcc.exams.oop;

/**
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    private long id;
    private String name;
    private Address address;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        if(id == null){
            this.id = Long.MIN_VALUE;
        }else{
            this.id = id;
        }

        this.name = name;
        this.address = address;
    }

    public Person() {
        this.id = Long.MIN_VALUE;
        this.name = "";
        this.address = new Address();
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
        if(this.id == ((Person)o).id && this.name == ((Person)o).name && ((this.address == null && ((Person)o).address ==
                null) || this.address.equals(((Person)o).address))){
            return true;
        }else {
            return false;
        }
    }

    public String toString(){

    }
}