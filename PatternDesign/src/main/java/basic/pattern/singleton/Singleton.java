package basic.pattern.singleton;

/**
 * Created by wenxue.li on 2017/4/26.
 */
public class Singleton {

/*
    私有的构造方法
*/
    private Singleton(){
      System.out.print("I am new");
    }

/*
    一个内部类来维护单例
    JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的
*/
    private static class SingleFactory{
        private static Singleton instance
                = new Singleton();
    }

    /*获取实例*/
    public static Singleton getInstance(){
        return SingleFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }

/*
    如果在构造函数中抛出异常，实例将永远得不到创建，也会出错
*/

}
