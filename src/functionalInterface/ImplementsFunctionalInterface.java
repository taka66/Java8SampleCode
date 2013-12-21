package functionalInterface;

/**
 * Created with IntelliJ IDEA.
 * User: fujiitakahiro
 * Date: 2013/12/18
 * time: 14:24
 * To change this template use File | Settings | File Templates.
 */
public class ImplementsFunctionalInterface {

    @FunctionalInterface
    interface IntOperator{
        int apply(int i0, int i1);
    }

    @FunctionalInterface
    interface IntFunction{
        int apply(int i);
    }

    public static void implIntOperator(){
        IntOperator intOperator = new IntOperator() {
            @Override
            public int apply(int i0, int i1) {
                return i0 * i1;  //To change body of implemented methods use File | Settings | File Templates.
            }
        };
    }

    public static void main(String[] args) {
    }
}
