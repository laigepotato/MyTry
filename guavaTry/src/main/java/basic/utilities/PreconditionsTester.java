package basic.utilities;

import com.google.common.base.Preconditions;

import java.util.List;

/**
 * Created by wenxue.li on 2017/4/19.
 */
public class PreconditionsTester {

/*
    Preconditions提供静态方法来检查方法或构造函数，被调用是否给定适当的参数。它检查的先决条件。其方法失败抛出IllegalArgumentException。
*/
    public static void main(String[] args) {
        try {
            Preconditions.checkArgument(1+1==3);
        } catch (Exception e) {
            System.out.println(e);
        }

        //List<String> list = new ArrayList<String>();
        List<String> list = null;
        try {
            Preconditions.checkNotNull(list) ;
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Preconditions.checkState(1+1==3);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
