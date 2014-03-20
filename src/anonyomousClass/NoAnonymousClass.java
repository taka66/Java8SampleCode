package anonyomousClass;

/**
 * Anonymous class is not newly function.
 * But for understanding lambda expression, we must understand what is the Anonymous Class.
 * For understand lambda expression, at first i explain following code.
 * User: fujiitakahiro
 * Date: 2013/12/21
 * Time: 19:12
 * To change this template use File | Settings | File Templates.
 */
public class NoAnonymousClass {
    public static void main(String[] args) {
        Java8 java8 = new Java8(); //instance
        java8.callTitle();
        // StudySession studySession = new StudySession(); //interface cannot be instanced.
    }

    static class Java8 implements StudySession{
        @Override public void callTitle(){
            System.out.println("Java8 study session");
        }
    }

    static interface StudySession{
        public void callTitle();
    }
}
