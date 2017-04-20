package basic.utilities;

import com.google.common.base.Objects;

/**
 * Created by wenxue.li on 2017/4/19.
 */
public class ObjectsTester {

/*
    Objects类提供适用于所有对象，如equals, hashCode等辅助函数
*/

    public static void main(String[] args) {
        ObjectsTester objectsTester = new ObjectsTester();
        Student s1 = objectsTester.newStudent("wenxue.li","0001");
        Student s2 = objectsTester.newStudent("yanhua.hou","0008");

        System.out.println(s1.equals(s2));
        System.out.println(Objects.equal(s1,s2));
        System.out.println(s1.hashCode());
       
    }

    class Student {
        private String name;
        private String num;

        public Student(String name, String num) {
            this.name = name;
            this.num = num;
        }

        @Override
        public boolean equals(Object object){
            if(object == null || !(object instanceof Student))
                return false;

            Student student = (Student) object;
            return Objects.equal(name,student.name)
                    && Objects.equal(num,student.num);

        }

        @Override
        public int hashCode(){
            return Objects.hashCode(name,num);
        }
    }

    Student newStudent(String name,String num){
        return new Student(name,num);
    }

}
