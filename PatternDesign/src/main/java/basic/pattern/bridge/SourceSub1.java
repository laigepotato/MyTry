package basic.pattern.bridge;

/**
 * Created by wenxue.li on 2017/4/28.
 */
public class SourceSub1 implements Sourceable{
    public void method() {
        System.out.println("this is the first sub!");
    }
}
