package basic.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wenxue.li on 2017/4/28.
 */
public class FlyweightFactory {

/*
    客户端不可以直接将具体享元类实例化，而必须通过一个工厂对象，利用一个factory()方法得到享元对象。
    一般而言，享元工厂对象在整个系统中只有一个，因此也可以使用单例模式。
*/

    private Map<String,FlightWeight> files = new HashMap<String, FlightWeight>();

    public FlightWeight factory(String state){
        FlightWeight fly = files.get(state);
        if(fly == null){
            fly = new ConcreteFlyweight(state);
            files.put(state,fly);
        }
        return fly;
    }

}
