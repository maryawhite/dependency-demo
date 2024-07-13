package com.example.service;

import com.example.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    private PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonServiceImpl();
    }

    @Test
    void assignDepartmentTest() {
        Person person = new Person("John Doe", 30);
        personService.assignDepartment(person, "Engineering");

        assertNotNull(person.getDepartment());
        assertEquals("Engineering", person.getDepartment().getName());
    }

    @Test
    void assignJobTitleTest() {
        Person person = new Person("Jane Doe", 25);
        personService.assignJobTitle(person, "Software Developer");

        assertNotNull(person.getJobTitle());
        assertEquals("Software Developer", person.getJobTitle().getTitle());
    }
}