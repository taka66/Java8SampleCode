package sort;

import dto.Student;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: fujiitakahiro
 * Date: 2014/03/11
 * Time: 13:37
 * To change this template use File | Settings | File Templates.
 */
public class StreamSort {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("taka", 2010, 80),
                new Student("isao", 2012, 90),
                new Student("hamada", 2011, 50),
                new Student("nabuchi", 2011, 80),
                new Student("test", 2011, 70)
        );
        Integer max = students.stream()
                .filter(s -> s.getGradYear() == 2011)
                .map(s -> s.getScore())
                .reduce(0, Math::max);
        System.out.println("max score is " + max);
    }


}
