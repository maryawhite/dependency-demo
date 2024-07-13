package org.example;

import com.example.model.Person;
import com.example.util.JsonUtil;
import com.example.util.StringUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void testPersonToJsonAndBack() {
        Person person = new Person("Jane Doe", 25);
        String json = JsonUtil.toJson(person);
        Person deserializedPerson = JsonUtil.fromJson(json, Person.class);

        assertEquals(person.getName(), deserializedPerson.getName());
        assertEquals(person.getAge(), deserializedPerson.getAge());

    }

    @Test
    public void testStringUtilCapitalize() {
        String input = "hello";
        String expected = "Hello";
        assertEquals(expected, StringUtil.capitalize(input));
    }





}