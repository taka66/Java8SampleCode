package sort;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: fujiitakahiro
 * Date: 2014/03/11
 * Time: 12:30
 * To change this template use File | Settings | File Templates.
 */
public class NumberSort {


    public static void main(String[] args) {
        /**
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        };

         Comparator<Integer> c = (Integer a, Integer b) -> {
         return a - b;
         };

         Comparator<Integer> c = (Integer a, Integer b) -> a - b;

         Comparator<Integer> c = (a, b) -> a - b;
        */
        Comparator<Integer> c = (a, b) -> a - b;
        List<Integer> numList = new ArrayList<Integer>();
        numList.add(9);
        numList.add(6);
        numList.add(7);
        System.out.println(numList);
        System.out.println("before");
        Collections.sort(numList, c);
        System.out.println(numList);
        System.out.println("after");
    }
}
