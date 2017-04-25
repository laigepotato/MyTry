package basic.pattern.factory.normal;

/**
 * Created by thinkpad on 2017/4/25.
 */
public class SenderFactoryWithDiffMethod {

    public  Sender produceMailSender(){
        return new MailSender();
    }

    public  Sender produceQmqSender(){
        return new QmqSender();
    }

}
