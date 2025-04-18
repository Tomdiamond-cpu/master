package com.example.crudproject.pojo;

import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.io.Serializable;
//请允许我说一句脏话 注释此类在重连后就连接成功了 什么毛病 奶奶的！！！
//创建并赋值五个属性
@Entity
@Table(name = "heroes")
public class Hero implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "name")
    private String name;
    @Column(name = "position")
    private String position;
    @Column(name = "hp")
    private float hp;
    @Column(name = "level")
    private int level;
    public Hero(){
    }
    //在springboot中 下面的都是可以省略的 艹
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}