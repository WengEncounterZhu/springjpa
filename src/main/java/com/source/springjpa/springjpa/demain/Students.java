package com.source.springjpa.springjpa.demain;

import javax.persistence.*;

@Entity
@Table(name = "t_stu")
//@Table(name = "article")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String sex;
    private int age;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Students(int id, String name, String sex, int age, String username, String password) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public Students() {
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
