package basic.pattern.factory.normal;

/**
 * Created by thinkpad on 2017/4/25.
 */
public class FactoryTest {
    public static void main(String[] args) {
        //普通工厂模式
        Sender sender = new SenderFactory().produce("mail");
        sender.send();

        //多个方法工厂模式
        Sender sender1 = new SenderFactoryWithDiffMethod().produceQmqSender();
        sender1.send();

        //静态方法工厂模式
        Sender sender2 = SenderFactoryStatic.produceMailSender();
        sender2.send();
    }
}
