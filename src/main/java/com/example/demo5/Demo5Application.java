package com.example.demo5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Demo5Application {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Demo5Application.class, args);
        System.out.println("hello world");
        System.in.read();
    }

}
