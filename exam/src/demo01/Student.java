package demo01;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/7 19:36
 */
public class Student {
    private String name;
    private int score;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.score = age;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
