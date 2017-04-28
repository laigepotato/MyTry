package basic.pattern.flyweight;

/**
 * Created by wenxue.li on 2017/4/28.
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        FlightWeight fly = factory.factory("a");
        fly.method("First Call");

        fly = factory.factory("b");
        fly.method("Second Call");

        fly = factory.factory("a");
        fly.method("Third Call");
    }
}
