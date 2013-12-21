package defaultMethod;

/**
 * Created with IntelliJ IDEA.
 * User: fujiitakahiro
 * Date: 2013/12/18
 * time: 2:29
 * To change this template use File | Settings | File Templates.
 */
public class ImplementsDefaultInterface implements DefaultInterface{
    public static void main(String[] args) {
        DefaultInterface defaultInterface = new ImplementsDefaultInterface();
        defaultInterface.show();
    }

    @Override
    public void show(){
        System.out.println("this default method is overwritten by ImplementsDefaultInterface.");
    }
}
