package com.dtcc.exams.oop.animals;

import com.dtcc.exams.oop.Address;
import com.dtcc.exams.oop.Person;

/**
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal extends Person{

    Long ID;
    Person person;

    /*
    Person handles name and ID and address
     */
    public Animal() {
        this(null, null);
    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */
    public Animal(Long id, Person owner) {
      this.ID = id;
      this.person = owner;

    }

    public Long getId() {
        return ID;
    }

    public void setId(Long id) {this.ID = id;}

    public Person getOwner() {
        return this.person;
    }

    public void setOwner(Person owner) {
        this.person = owner;
    }

    public Address getAddress() {
        return person.getAddress();
    }
}
