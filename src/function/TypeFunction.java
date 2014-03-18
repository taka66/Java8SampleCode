package function;

import java.util.function.Function;
import java.util.function.BiFunction;

/**
 * Created with IntelliJ IDEA.
 * User: fujiitakahiro
 * Date: 2013/12/18
 * time: 10:24
 * To change this template use File | Settings | File Templates.
 */
public class TypeFunction {
    public static void main(String[] args) {
        /**
         * function<argument,return>
         */
        Function<String,String> sample = s -> "your argument is " + s ;
        System.out.println(sample.apply("test"));

        BiFunction<Integer,Integer,Integer> sum = (Integer i1, Integer i2) -> { return i1+i2; } ;
        System.out.println(sum.apply(1,2));
    }
}
