package basic.pattern.adapter.forinter;

/**
 * Created by wenxue.li on 2017/4/28.
 */
public class SourceSub1 extends Wrapper {

    @Override
    public void method1() {
        super.method1();
        System.out.println("the sourceable interface's first Sub1!");

    }
}
