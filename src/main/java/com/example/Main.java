package com.example;

import com.example.config.AppConfig;
import com.example.model.Department;
import com.example.model.JobTitle;
import com.example.model.Person;
import com.example.service.PersonService;
import com.example.util.HttpClientUtil;
import com.example.util.JsonUtil;
import com.example.util.LoggingUtil;
import com.example.util.StringUtil;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        AppConfig config = new AppConfig();
        PersonService personService = config.personService();
//        Department department = new Department("Engineering");
//
//        JobTitle jobTitle = new JobTitle("Software Developer");

        Person person = new Person("john doe", 30);
        personService.assignDepartment(person, "Engineering");
        personService.assignJobTitle(person, "Software Developer");

        //use StringUtil
        person.setName(StringUtil.capitalize(person.getName()));
        System.out.println(person);

        //convert Person to JSON using JsonUtil
        String personJson = JsonUtil.toJson(person);
        System.out.println("JSON: " + personJson);

        //Convert JSON back to Person
        Person newPerson = JsonUtil.fromJson(personJson, Person.class);
        System.out.println("from JSON: " + newPerson);

        // Logging example
        LoggingUtil.logInfo("Application started successfully");

        // HTTP Client example
        try {
            String response = HttpClientUtil.get("https://jsonplaceholder.typicode.com/posts/1");
            System.out.println("HTTP GET Response: " + response);
        } catch (IOException | ParseException e) {
            LoggingUtil.logError("Error during HTTP request", e);
        }
    }

}