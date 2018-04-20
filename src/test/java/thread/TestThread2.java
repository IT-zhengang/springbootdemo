package thread;

public class TestThread2 {
    public static void main(String[] args){
        final Object obj =new Object();
        Thread t1=new Thread(new Runnable(){
            public void run()
            {
                synchronized (obj){
                    for (int i=1;i<=26;i++){
                        System.out.print(i+"  ");
                        obj.notify();
                        if(i<26){
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }    });
        Thread t2=new Thread(new Runnable(){
            public void run()
            {
                synchronized (obj){
                    for (char i='A';i<='Z';i++){
                        System.out.print(i+"  ");
                        obj.notify();
                        if(i<'Z'){
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                }
            }    });
        //开启线程
        t1.start();
        t2.start();
    }
}
