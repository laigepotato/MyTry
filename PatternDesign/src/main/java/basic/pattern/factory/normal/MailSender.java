package basic.pattern.factory.normal;

/**
 * Created by thinkpad on 2017/4/25.
 */
public class MailSender implements Sender {
    public void send() {
        System.out.println("I send mail message!");
    }
}
