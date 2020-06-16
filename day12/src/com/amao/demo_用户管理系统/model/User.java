package com.amao.demo_用户管理系统.model;

import com.amao.demo_用户管理系统.dao.Utils;

import java.util.Objects;

/**
 * 用户信息
 * id
 * 用户名
 * 密码
 * 姓名
 * 年龄
 * 性别
 * 出生日期
 * 联系方式
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String name;
    private int age;
    private String gender;
    private String birthday;
    private int competence;

    public User() {
    }

    public User(int id, String username, String password, String name, String gender, String birthday, int competence) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.competence = competence;
    }

    /**
     * 用户名和密码
     *
     * @param username
     * @param password
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        age = Utils.birthdayToAge(this.birthday);
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setCompetence(int competence) {
        this.competence = competence;
    }

    public int getCompetence() {
        return competence;
    }

    @Override
    public String toString() {
        return "用户信息{" +
                " 用户名='" + username + '\'' +
                ", 姓名='" + name + '\'' +
                ", 年龄=" + getAge() +
                ", 性别='" + gender + '\'' +
                ", 出生日期='" + birthday + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
