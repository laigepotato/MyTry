package basic.pattern.observer;

/**
 * Created by wenxue.li on 2017/5/4.
 */
public class MySubject extends AbstractSubject {

    public void operation() {
        System.out.println("Update Myself!");
        notifyObserver();
    }
}
