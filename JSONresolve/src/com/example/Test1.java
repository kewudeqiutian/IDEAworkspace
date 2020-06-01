package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Date;

public class Test1 {

    //java对象转为json
    @Test
    public void test1() throws Exception {
        Person person = new Person();
        person.setGender("男");
        person.setName("张三");
        person.setAge(23);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(person);
        System.out.println(str);
    }

}
