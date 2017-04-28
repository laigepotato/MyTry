package basic.pattern.bridge;

/**
 * Created by wenxue.li on 2017/4/28.
 */
public class MyBridge extends Bridge {

     public void method(){
          getSource().method();
     }

}
