// src/main/java/com/example/zaff/ZaffApplication.java (or your main application class)
package com.example.zaff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.zaff") // Make sure to include the correct base package
public class ZaffApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZaffApplication.class, args);
    }
}
