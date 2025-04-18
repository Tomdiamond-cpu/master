package com.example.crudproject;

import com.example.crudproject.service.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CruDprojectApplication {
@Autowired
HeroRepository heroRepository;
    public static void main(String[] args) {
        SpringApplication.run(CruDprojectApplication.class, args);
        System.out.println();
    }


}
