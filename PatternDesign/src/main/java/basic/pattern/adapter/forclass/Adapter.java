package basic.pattern.adapter.forclass;

/**
 * Created by wenxue.li on 2017/4/27.
 */
public class Adapter extends Source implements Targetable{


    public void methodNew() {
        System.out.println("this is the targetable method!");

    }
}
