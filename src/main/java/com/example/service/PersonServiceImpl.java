package com.example.service;

import com.example.model.Department;
import com.example.model.JobTitle;
import com.example.model.Person;

public class PersonServiceImpl implements PersonService {
    @Override
    public void assignDepartment(Person person, String departmentName) {
        Department department = new Department(departmentName);
        person.setDepartment(department);

    }

    @Override
    public void assignJobTitle(Person person, String jobTitle) {
        JobTitle jobTitleObj = new JobTitle(jobTitle);
        person.setJobTitle(jobTitleObj);
    }
}
