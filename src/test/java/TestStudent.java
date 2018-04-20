import java.util.*;

public class TestStudent {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<Student>();
        students.add(new Student(1,"lisi",new Date()));
        students.add(new Student(2,"wangwu",new Date()));
        students.add(new Student(1,"lisi",new Date()));
        for (Student stu: students) {
            System.out.println(stu);
        }
        Set<Student> set = new TreeSet<Student>();
        set.add(new Student(1,"lisi",new Date()));
        set.add(new Student(2,"wangwu",new Date()));
        set.add(new Student(1,"lisi",new Date()));
        for (Student stu: set) {
            System.out.println(stu);
        }

        TreeSet<Student> students1 = new TreeSet<Student>(Collections.reverseOrder(new MyComparator()));
        students1.add(new Student(1,"lisi",new Date()));
        students1.add(new Student(2,"wangwu",new Date()));
        students1.add(new Student(1,"lisi",new Date()));
        for (Student stu: students1) {
            System.out.println(stu);
        }
    }
}
