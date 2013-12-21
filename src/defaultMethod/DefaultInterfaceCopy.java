package defaultMethod;

/**
 * Created with IntelliJ IDEA.
 * User: fujiitakahiro
 * Date: 2013/12/18
 * time: 2:25
 * To change this template use File | Settings | File Templates.
 */
public interface DefaultInterfaceCopy {
    default public void show(){
        System.out.println("this is default method of show()");
    }
}
