package com.example.log4j2demo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Log4j2demoApplication {

    public static void main(String[] args) {

        Logger log = LoggerFactory.getLogger(Log4j2demoApplication.class);
        log.error("Something else is wrong here");
        log.error("Something else is wrong h222222ere");
        log.info("11111111");
        System.out.println("Hello World");
    }

}
