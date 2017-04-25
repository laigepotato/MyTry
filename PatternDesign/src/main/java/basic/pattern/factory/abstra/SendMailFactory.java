package basic.pattern.factory.abstra;

/**
 * Created by thinkpad on 2017/4/25.
 */
public class SendMailFactory implements Producer{
    public Sender produce() {
        return new MailSender();
    }
}
