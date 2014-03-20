package dto;

/**
 * Created with IntelliJ IDEA.
 * User: fujiitakahiro
 * Date: 2014/03/11
 * Time: 15:35
 * To change this template use File | Settings | File Templates.
 */
public class Student {
    String name;
    Integer gradYear;
    Integer score;

    public Student(String name, Integer gradYear, Integer score) {
        this.name = name;
        this.gradYear = gradYear;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGradYear() {
        return gradYear;
    }

    public void setGradYear(Integer gradYear) {
        this.gradYear = gradYear;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
