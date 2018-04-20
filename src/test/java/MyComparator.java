import java.util.Comparator;

public class MyComparator  implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        int i = s1.getId().compareTo(s2.getId());
        if(i==0){
            return s2.getBirthday().compareTo(s1.getBirthday())+s1.getName().compareTo(s2.getName());
        }
        return i;
    }
}
