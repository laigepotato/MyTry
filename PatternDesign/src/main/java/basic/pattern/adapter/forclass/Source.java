package basic.pattern.adapter.forclass;

/**
 * Created by wenxue.li on 2017/4/27.
 */
public class Source {
/*
    有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
*/

    public void methodSource(){
        System.out.println("I have an original method!");
    }
}
