package anonyomousClass;

/**
 * Created with IntelliJ IDEA.
 * User: fujiitakahiro
 * Date: 2014/03/10
 * Time: 23:04
 * To change this template use File | Settings | File Templates.
 */
public class SamSample {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    System.out.println(i);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 100; i < 105; i++) {
                    try {
                        Thread.sleep(700);
                    } catch (InterruptedException e) {
                    }
                    System.out.println(i);
                }
            }
        }).start();
    }
}
