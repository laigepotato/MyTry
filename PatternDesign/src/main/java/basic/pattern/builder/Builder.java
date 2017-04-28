package basic.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenxue.li on 2017/4/27.
 */
public class Builder {
/*
    建造者模式将很多功能集成到一个类里，这个类可以创造出比较复杂的东西。所以与工程模式的区别就是：工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分。
*/

    private List<Sender> senders = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for (int i=0 ; i< count ; i++)
            senders.add(new MailSender());
    }

    public void produceQmqSender(int count){
        for (int i=0 ; i< count ; i++)
            senders.add(new QmqSender());
    }
}
