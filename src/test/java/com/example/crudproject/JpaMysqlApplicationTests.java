package com.example.crudproject;

import com.example.crudproject.pojo.Hero;
import com.example.crudproject.service.HeroRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@SpringBootTest

public class JpaMysqlApplicationTests {
    @Autowired
    private HeroRepository heroRepository;
    @Test
    public void testGetHero(){
        List<Hero> hero=heroRepository.findAll();
        hero.forEach(hero1 -> System.out.println(hero));
    }
}
