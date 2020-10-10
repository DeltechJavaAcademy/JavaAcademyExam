package com.dtcc.exams.oop;

/**
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    private Long id;
    private String name;
    private Address address = new Address();
    public Person(Long id, String name, Address address) {
        this.id = Long.MIN_VALUE;
        this.name = name;
        this.address = address;
    }

    public Person() {
        this.address = new Address();
        this.name ="";
        this.id = Long.MIN_VALUE;
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
        if (o == this){
            return true;
        }else if(o instanceof Person){
            Person perse = (Person) o;
            return id.equals(perse.id) &&
                    name.equals(perse.name)&&
                    address.equals(perse.address);
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{id="+this.id+", name='"+this.name+"', address="+this.address+"}";
    }
}