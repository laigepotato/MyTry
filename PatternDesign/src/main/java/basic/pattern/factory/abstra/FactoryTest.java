package basic.pattern.factory.abstra;

/**
 * Created by thinkpad on 2017/4/25.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Producer producer = new SendQmqFactory();
        Sender sender = producer.produce();
        sender.send();
    }
}
