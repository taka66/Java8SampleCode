package string;

import java.util.StringJoiner;

/**
 * Created with IntelliJ IDEA.
 * User: fujiitakahiro
 * Date: 2013/12/18
 * time: 1:33
 * To change this template use File | Settings | File Templates.
 */
public class StringJoin {
    public static void main(String[] args) {
        //string Joiner
        StringJoiner stringJoiner = new StringJoiner(",","[","]");
        stringJoiner.add("first").add("second").add("third");
        System.out.println(stringJoiner.toString());

        //string Join
        String joinSample = String.join(",","first","second","third");
        System.out.println(joinSample);
    }
}
