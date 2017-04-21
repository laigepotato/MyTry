package basic.utilities;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * Created by wenxue.li on 2017/4/21.
 */
public class BiMapTester {

/*
    BiMap是一种特殊的映射其保持映射，同时确保没有重复的值是存在于该映射和一个值可以安全地用于获取键背面的倒数映射。
*/

    public static void main(String[] args) {
        BiMap<Integer,String> biMap = HashBiMap.create();

        biMap.put(new Integer(100),"Lucy");
        biMap.put(new Integer(99),"Jim");
        biMap.put(new Integer(98),"Tom");

        System.out.println(biMap.inverse().get("Jim"));
    }
}
