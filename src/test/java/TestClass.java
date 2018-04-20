public class TestClass {
   //构造代码块
    {
        System.out.println("2");
    }
    //静态初始化代码块
    static {
        System.out.println("1");
    }
    //构造函数
    public TestClass(){
        super();
        System.out.println("3");
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
    }


}
