package basic.pattern.factory.normal;

/**
 * Created by thinkpad on 2017/4/25.
 */
public class SenderFactory {

    public Sender produce(String type){
        if("mail".equals(type))
            return new MailSender();
        else
            return new QmqSender();

    }
}
