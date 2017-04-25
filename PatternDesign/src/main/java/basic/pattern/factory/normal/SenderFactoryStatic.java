package basic.pattern.factory.normal;

/**
 * Created by thinkpad on 2017/4/25.
 */
public class SenderFactoryStatic {
    public static Sender produceMailSender(){
        return new MailSender();
    }

    public static Sender produceQmqSender(){
        return new QmqSender();
    }
}
