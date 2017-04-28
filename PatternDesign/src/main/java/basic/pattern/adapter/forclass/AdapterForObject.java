package basic.pattern.adapter.forclass;

/**
 * Created by wenxue.li on 2017/4/28.
 */
public class AdapterForObject implements Targetable{

    private Source source;

    public AdapterForObject(Source source){
        super();
        this.source = source;

    }

    public void methodSource() {
        source.methodSource();
    }

    public void methodNew() {
        System.out.println("this is the targetable method!");
    }
}
