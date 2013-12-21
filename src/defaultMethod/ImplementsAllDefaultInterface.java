package defaultMethod;

/**
 * Created with IntelliJ IDEA.
 * User: fujiitakahiro
 * Date: 2013/12/18
 * time: 2:35
 * To change this template use File | Settings | File Templates.
 */
public class ImplementsAllDefaultInterface implements DefaultInterface,DefaultInterfaceCopy{

    /**
     * if you comment out this method, you cannot compile it.
     */
    @Override
    public void show(){

    }
}
