package basic.pattern.factory.abstra;

/**
 * Created by thinkpad on 2017/4/25.
 */
public class SendQmqFactory implements Producer{
    public Sender produce() {
        return new QmqSender();
    }
}
