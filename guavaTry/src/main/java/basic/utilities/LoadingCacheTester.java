package basic.utilities;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by wenxue.li on 2017/4/21.
 */
public class LoadingCacheTester {

/*
    Guava通过接口LoadingCache提供了一个非常强大的基于内存的LoadingCache<K，V>。在缓存中自动加载值，它提供了许多实用的方法，在有缓存需求时非常有用。
*/

    public static void main(String[] args) {
        LoadingCache loadingCache =
                CacheBuilder.newBuilder()
                .maximumSize(100)  // maximum 100 records can be cached
                .expireAfterAccess(30, TimeUnit.MINUTES)   // cache will expire after 30 minutes of access
                .build(new CacheLoader<String, Student>() {
                    @Override
                    public Student load(String num) throws Exception {
                        return searchByNum(num);
                    }
                });

        try {
            System.out.println(((Student)loadingCache.get("003")).getName());
            System.out.println(loadingCache.get("003"));
        } catch (ExecutionException e) {
            System.out.println(e);
        }


    }

    private static Student  searchByNum(String num){
        Map  students = new HashMap();
        students.put("001",new Student("001","Lily"));
        students.put("002",new Student("002","Lucy"));
        students.put("003",new Student("003","Tom"));

        return (Student) students.get(num) ;
    }

    private  static  class Student {
        private String num;
        private String name;

        public Student(String num, String name) {
            this.num = num;
            this.name = name;
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
