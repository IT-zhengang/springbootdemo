package thread;

import java.util.LinkedList;
import java.util.Queue;

public class TestQuque {
    public static void main(String[] args) {
        Queue<String> queue =new LinkedList<String>();
        queue.offer("zhangsan");
        queue.offer("lisi");
        queue.offer("wangwu");
        queue.offer("zhaoliu");
        for (String str :
                queue) {
            System.out.println(str);
        }
    }
}
