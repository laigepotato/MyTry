package basic.pattern.decorator;

/**
 * Created by wenxue.li on 2017/4/28.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();

        Sourceable decorator = new Decorator(source);

        decorator.methodSource();
    }
}
