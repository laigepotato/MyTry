package basic.pattern.observer;

/**
 * Created by wenxue.li on 2017/5/4.
 */
public interface Subject {

    public void add(Observer observer);

    public void del(Observer observer);

    public void notifyObserver();

    public void operation();


}
