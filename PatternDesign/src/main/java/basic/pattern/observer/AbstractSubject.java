package basic.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenxue.li on 2017/5/4.
 */
public abstract class AbstractSubject implements Subject{

    private List<Observer> list = new ArrayList<Observer>();

    public void add(Observer observer) {
        list.add(observer);
    }

    public void del(Observer observer) {
        list.remove(observer);
    }

    public void notifyObserver() {
         for (Observer observer : list){
             observer.update();
         }
    }

    
}
