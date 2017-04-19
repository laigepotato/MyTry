package basic.utilities;

import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wenxue.li on 2017/4/19.
 */
public class OrderingTester {
    
/*    Ordering(排序)可以被看作是一个丰富的比较具有增强功能的链接，多个实用方法，多类型排序功能等。
    以下是com.google.common.collect.Ordering<T>类的声明：

    @GwtCompatible
    public abstract class Ordering<T>
            extends Object
            implements Comparator<T>

            */


    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("orange");
        names.add("potato");
        names.add("apple");
        names.add("banana");
        names.add("tomato");

        Ordering ordering = Ordering.natural();
        Collections.sort(names,ordering.reverse());

        System.out.println(names);
    }
}
