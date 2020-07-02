package com.amao.demo02_Lambda;

public class Student02 {
    private String name;
    private int age;
    private int score;

    public Student02(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Student02() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
