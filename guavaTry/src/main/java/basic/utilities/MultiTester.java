package basic.utilities;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.Set;

/**
 * Created by wenxue.li on 2017/4/21.
 */
public class MultiTester {
/*
    1	Multiset
    一个扩展来设置界面，允许重复的元素。
    2	Multimap
    一个扩展来映射接口，以便其键可一次被映射到多个值
    3	BiMap
    一个扩展来映射接口，支持反向操作。
    4	Table
    表代表一个特殊的图，其中两个键可以在组合的方式被指定为单个值。*/

    public static void main(String[] args) {
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        multiset.add("d");
        multiset.add("e");
        multiset.add("e");
        multiset.add("f");

        System.out.println(multiset.count("e"));
        System.out.println(multiset.size());

        for(String s : multiset){
            System.out.println(s);
        }

        Set<String> set = multiset.elementSet();
        for(String s : set){
            System.out.println(s);
        }

        for(Multiset.Entry<String> entry : multiset.entrySet()){
            System.out.println(entry.getElement()+":"+entry.getCount());
        }
    }

    
}
