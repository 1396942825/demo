package com.example.demo.constroller;

import com.example.demo.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller
@RestController
public class HelloController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String hello(){
        return person.toString();
    }
}
