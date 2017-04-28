package basic.pattern.facade;

/**
 * Created by wenxue.li on 2017/4/28.
 */
public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
