package com.example.config;

import com.example.service.PersonService;
import com.example.service.PersonServiceImpl;

public class AppConfig {
    public PersonService personService() {
        return new PersonServiceImpl();
    }
}
