package basic.pattern.proxy;

/**
 * Created by wenxue.li on 2017/4/28.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.methodSource();
    }
}
