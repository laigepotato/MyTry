package basic.pattern.proxy;

/**
 * Created by wenxue.li on 2017/4/28.
 */
public class Proxy implements Sourceable {
    
    private Source source;
    
    public Proxy(){
       super();
       source = new Source();
    }
    public void methodSource() {
        before();
        source.methodSource();
        after();
    }

    private void after() {
        System.out.println("after proxy!");

    }

    private void before() {
        System.out.println("before proxy!");

    }
}
