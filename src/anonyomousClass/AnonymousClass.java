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
public class AnonymousClass {
    public static void main(String[] args) {
        StudySession studySession = () -> System.out.println("Java8 study session");
        StudySession withLambda = () -> System.out.println("Java8 study session");
        studySession.callTitle();
    }

    static interface StudySession{
        public void callTitle();
    }
}
