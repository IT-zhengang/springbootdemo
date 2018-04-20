package thread;

/**
 * 创建两个线程，一个进行打印1~26，另一个线程进行打印a-z
 * 要求：互不影响
 */
public class TestThread {
    //同步锁标记

    public static void main(String[] args) {
        final Object obj =new Object();
        Thread t1=new Thread(new Runnable(){
            public void run()
            {
                synchronized (obj){
                    for (int i=1;i<=26;i++){
                        System.out.print(i+"  ");
                    }
                    System.out.println();
                }
            }    });
        Thread t2=new Thread(new Runnable(){
            public void run()
            {
                synchronized (obj){
                    for (char i='A';i<='Z';i++){
                        System.out.print(i+"  ");
                    }
                    System.out.println();
                }
            }    });
            //开启线程
        t1.start();
        t2.start();

    }


}
