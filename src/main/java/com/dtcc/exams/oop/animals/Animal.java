package com.dtcc.exams.oop.animals;

import com.dtcc.exams.oop.Address;
import com.dtcc.exams.oop.Person;

/**
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal {
    private Long id;
    private Person person;
    private Address address;

    public Animal() {
        this.id = null;//Long.parseLong(null);
        this.person = null;
        this.address = null;

    }

    /**
     * @param id    - id of animal
     * @param owner - owner of animal
     */
    public Animal(Long id, Person owner) {
        this.id = id;
        this.person = owner;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getOwner() {
        return this.person;
    }

    public void setOwner(Person owner) {
        this.person = owner;
    }

    public Address getAddress() {
        return this.address;
    }


    public boolean equals(Object o) {
        if (((null == this.id && ((Animal) o).id == null) || this.id == ((Animal) o).id) &&
                (null == this.person && o == null) || this.person.equals(((Animal) o).person) &&
                (null == this.address && o == null) || this.address.equals(((Animal) o).address)) {
            return true;
        }
        return false;
    }
}
