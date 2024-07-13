package com.example.service;

import com.example.model.Person;

public interface PersonService {
    void assignDepartment(Person person, String departmentName);
    void assignJobTitle(Person person, String jobTitle);

}
