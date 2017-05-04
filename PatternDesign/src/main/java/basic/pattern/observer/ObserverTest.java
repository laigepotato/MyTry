package basic.pattern.observer;

/**
 * Created by wenxue.li on 2017/5/4.
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new MySubject();
        subject.add(new ObserverA());
        subject.add(new ObserverB());
        
        subject.operation();
    }
}
