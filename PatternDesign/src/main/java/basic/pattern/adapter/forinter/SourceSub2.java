package basic.pattern.adapter.forinter;

/**
 * Created by wenxue.li on 2017/4/28.
 */
public class SourceSub2 extends Wrapper {

    @Override
    public void method2() {
        super.method2();
        System.out.println("the sourceable interface's second Sub2!");
    }
}
