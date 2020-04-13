package com.example.demo;

import com.example.demo.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {

    Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
        logger.debug("-------------debug");
        logger.info("-------------info");
    }

}
