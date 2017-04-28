package basic.pattern.strategy;

/**
 * Created by wenxue.li on 2017/4/28.
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        
        Context context = new Context(strategy);

        context.contextInterface();
    }
}
