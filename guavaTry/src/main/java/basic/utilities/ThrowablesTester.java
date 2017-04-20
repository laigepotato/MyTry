package basic.utilities;

import com.google.common.base.Throwables;

/**
 * Created by wenxue.li on 2017/4/20.
 */
public class ThrowablesTester {
/*
    Throwable类提供了相关的Throwable接口的实用方法。
*/

/*
    在Java的异常类体系中,Error和RuntimeException是非检查型异常，其他的都是检查型异常。
    所有方法都可以在不声明throws的情况下抛出RuntimeException及其子类

    简单的说，非RuntimeException要自己写catch块处理掉

    Exception：在程序中必须使用try...catch进行处理。
    RuntimeException：可以不使用try...catch进行处理，但是如果有异常产生，则异常将由JVM进行处理

    对于RuntimeException的子类最好也使用异常处理机制
    */

    public static void main(String[] args) {
        ThrowablesTester throwablesTester = new ThrowablesTester();

        try {
            throwablesTester.showThrowables();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void showThrowables() throws InvalidInputException{
        try {
            throw new IndexOutOfBoundsException();
        } catch (Throwable e) {
            Throwables.propagateIfInstanceOf(e,InvalidInputException.class);
        }
    }

    class InvalidInputException extends Exception{
        public InvalidInputException(){
            super("~~自定义异常~~");
        }
    }

}
