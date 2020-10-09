package com.dtcc.exams.oop.person;

import com.dtcc.exams.oop.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonEqualsTest {
    @Test
    public void checkDefaultPersonEquivalence() {
        // given
        Person person1 = new Person();
        Person person2 = new Person();

        // when
        Boolean outcome = person1.equals(person2);

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void checkDefaultPersonNonEquivalence() {
        // given
        Person person1 = new Person(null, "PersonName", null);
        Person person2 = new Person();

        // when
        Boolean outcome = person1.equals(person2);

        // then
        Assert.assertFalse(outcome);
    }

    @Test
    public void checkNonDefaultPersonEquivalence() {
        // given
        Person person1 = new Person(null, "PersonName", null);
        Person person2 = new Person(null, "PersonName", null);
        System.out.println(person1.getId());
        System.out.println(person2.getId());
        System.out.println((person1.getName().equals(((Person) person2).getName())));
        // when
        Boolean outcome = person1.equals(person2);

        // then
        Assert.assertTrue(outcome);
    }
}