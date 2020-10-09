package com.dtcc.exams.oop.animals;

import com.dtcc.exams.oop.Address;
import com.dtcc.exams.oop.Person;

/**
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal extends Person{

    /*
    Person handles name and ID and address
     */
    public Animal() {
    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */
    public Animal(Long id, Person owner) {
    }

    public Long getId() {
        return this.getId();
    }

    public void setId(Long id) {this.setId(id);
    }

    public Person getOwner() {
        return null;
    }

    public void setOwner(Person owner) {
    }

    public Address getAddress() {
        return null;
    }
}
