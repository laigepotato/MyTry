package basic.pattern.decorator;

/**
 * Created by wenxue.li on 2017/4/28.
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;

    }

    public void methodSource() {
        System.out.println("before decorator!");
        source.methodSource();
        System.out.println("after decorator!");
    }
}
