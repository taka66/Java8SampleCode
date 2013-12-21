package functionalInterface;

import java.lang.*;

/**
 * Created with IntelliJ IDEA.
 * User: fujiitakahiro
 * Date: 2013/12/18
 * time: 8:54
 * To change this template use File | Settings | File Templates.
 */
public class UseLambda{

    @FunctionalInterface
    public interface IntAdd {int f(int i1, int i2);}

    public static void main(String[] args) {
        notUsing();
        usingPhase1();
        usingPhase2();
    }

    public static void notUsing(){
        IntAdd intAdd = new IntAdd() {
            @Override
            public int f(int i1, int i2) {
                return i1+i2;  //To change body of implemented methods use File | Settings | File Templates.
            }
        };
        int result = intAdd.f(1,2);
        System.out.println(result);
    }

    public static void usingPhase1(){
        IntAdd intAdd = (int i1, int i2) -> {
                return i1+i2;
        };
        int result = intAdd.f(1,2);
        System.out.println(result);
    }

    public static void usingPhase2(){
        /**
         * if you write code only 1line, you can omit (),{},return
         */
        IntAdd intAdd = (i1, i2) -> i1 + i2;
        int result = intAdd.f(1,2);
        System.out.println(result);
    }

}
