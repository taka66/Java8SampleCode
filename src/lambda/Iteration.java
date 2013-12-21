package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: fujiitakahiro
 * Date: 2013/12/18
 * time: 14:33
 * To change this template use File | Settings | File Templates.
 */
public class Iteration {
    public static void main(String[] args) {
        stringIteration();

    }

    public static void stringIteration() {
        // Current java
        String[] alphas = {"abc", "bde", "cfg", "ded", "egs", "gro"};
        for (String s : alphas) {
            if (!s.startsWith("a")) {
                continue;
            }
            String u = s.toUpperCase();
            System.out.println(u);
        }

        // Using Stream Filtering
        List<String> alphas2 = Arrays.asList("abc", "bde", "cfg", "ded", "egs", "gro");
        alphas2.parallelStream()
                .filter(s -> s.startsWith("a"))
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
    }
}
