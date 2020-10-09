package com.dtcc.exams.oop;

/**
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    private Long id;
    private String name;
    private Address address=new Address();
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id=id;
        this.name=name;
        this.address=address;

    }

    public Person() {
        this(Long.MIN_VALUE,"",new Address());
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address=address;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o){return true;}
        if(!(o instanceof Person)) {return false;}
        Person p = (Person)o;
        return  id.equals(p.id)
                && name.equals(p.name)
                && address.equals(p.getAddress());
    }

    public String toString(){

        return "Person{id="+this.id+", name='"+this.name+"', address="+this.address+"}";
    }
}