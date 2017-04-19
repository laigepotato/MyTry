package basic.utilities;

import com.google.common.base.Optional;

/**
 * Created by wenxue.li on 2017/4/19.
 */
public class OptionalTester {
/*
    Optional用于包含非空对象的不可变对象。 Optional对象，用于不存在值表示null。这个类有各种实用的方法，以方便代码来处理为可用或不可用，而不是检查null值。
*/
    public static void main(String[] args) {
         Integer value1 = null;
         Integer value2 = new Integer(10);

         Optional<Integer> ov1 = Optional.fromNullable(value1);
         Optional<Integer> ov2 = Optional.of(value2);

         System.out.print(sum(ov1,ov2));
    }

    private static Integer sum(Optional<Integer> ov1, Optional<Integer> ov2) {

        System.out.println("First parameter is present: " + ov1.isPresent());
        System.out.println("Second parameter is present: " + ov2.isPresent());


       return ov1.or(new Integer(0))+ov2.or(new Integer(0)) ;
    }
}
