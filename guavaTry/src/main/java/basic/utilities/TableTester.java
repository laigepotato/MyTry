package basic.utilities;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.Map;
import java.util.Set;

/**
 * Created by wenxue.li on 2017/4/21.
 */
public class TableTester {

/*
    Table代表一个特殊的映射，其中两个键可以在组合的方式被指定为单个值。它类似于创建映射的映射。
*/
    public static void main(String[] args) {
       Table<String,String,String> table = HashBasedTable.create();

        table.put("IBM","001","Jim");
        table.put("IBM","002","Tom");

        table.put("Facebook","001","Lucy");
        table.put("Facebook","002","Lily");

        table.put("Microsoft","001","Lily");
        table.put("Microsoft","002","Jim");

        Map<String,String> ibmMap = table.row("IBM");

        for(Map.Entry<String, String> entry : ibmMap.entrySet()){
            System.out.println("Emp Id: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        Set<String> employers = table.rowKeySet();
        System.out.print("Employers: ");
        for(String employer: employers){
            System.out.print(employer + " ");
        }

        Map<String,String> EmployerMap =  table.column("001");
        for(Map.Entry<String, String> entry : EmployerMap.entrySet()){
            System.out.println("Employer: " + entry.getKey() + ", Name: " + entry.getValue());
        }


    }
}
