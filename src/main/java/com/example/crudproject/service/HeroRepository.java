package com.example.crudproject.service;



import com.example.crudproject.demos.web.User;
import com.example.crudproject.pojo.Hero;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HeroRepository extends JpaRepository<Hero, Integer> {

}
