package basic.pattern.adapter.forclass;

/**
 * Created by wenxue.li on 2017/4/27.
 */
public class AdapterTest {

    public static void main(String[] args) {
       Targetable target = new Adapter();
       target.methodSource();
       target.methodNew();

       Source source = new Source();
       Targetable taget2 = new AdapterForObject(source);
       taget2.methodSource();
       taget2.methodNew();
    }

}
