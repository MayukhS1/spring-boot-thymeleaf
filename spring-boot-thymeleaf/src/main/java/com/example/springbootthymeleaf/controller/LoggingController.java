package com.example.springbootthymeleaf.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;


@RestController
public class LoggingController {
    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/log")
    public Map<String, Object> hello() {
        Map<String, Object> result = new HashMap<>();
        result.put("name", "Stephen Hawking");
        logger.info("this is a test info message");
        logger.warn("this is a test warn message");
        logger.error("this is a test error message");
        return result;
    }
}
