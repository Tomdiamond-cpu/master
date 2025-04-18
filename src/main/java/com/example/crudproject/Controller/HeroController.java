package com.example.crudproject.Controller;

import com.example.crudproject.pojo.Hero;
import com.example.crudproject.service.HeroRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.io.StringReader;
import java.util.List;

@Controller
public class HeroController {
    @Autowired
    HeroRepository heroRepository;
    @RequestMapping("/List-hero")
//给前端 了一个接口 配合网页做后缀来启动功能
    public String  ListHero(Model model) {
        List<Hero> hero=heroRepository.findAll();
        System.out.println("查询结果数量：" + hero.size());
        model.addAttribute("heroes",hero);

        return "List-hero";}

}
