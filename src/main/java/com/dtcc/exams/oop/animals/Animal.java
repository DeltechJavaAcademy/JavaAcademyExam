package com.dtcc.exams.oop.animals;

import com.dtcc.exams.oop.Address;
import com.dtcc.exams.oop.Person;
/**
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal {

    private Long id;
    private Person owner;

    public Animal() {
        this.id = null;
        this.owner = owner;
    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */
    public Animal(Long id, Person owner) {
        this.id = id;
        this.owner = owner;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getOwner() {
        return this.owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Address getAddress() {
        return this.owner.getAddress();
    }
}
