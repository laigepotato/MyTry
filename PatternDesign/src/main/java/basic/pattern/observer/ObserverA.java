package basic.pattern.observer;

/**
 * Created by wenxue.li on 2017/5/4.
 */
public class ObserverA implements Observer {
    public void update() {
        System.out.println("Observer A received!");
    }
}
