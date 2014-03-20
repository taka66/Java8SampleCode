package iteration;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: fujiitakahiro
 * Date: 2014/03/11
 * Time: 14:07
 * To change this template use File | Settings | File Templates.
 */
public class ForEachSample {
    public static void main(String[] args) {
        //Until java7
        List<String> l = Arrays.asList("fu","jii","ta","kahiro");
        System.out.println("Until Java7");
        for(String s : l) {
            System.out.println(s);
        }

        //From java8
        System.out.println("From Java8");
        l.forEach(s -> System.out.println(s));

    }
}
