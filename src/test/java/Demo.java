public class Demo {
    public static void m1()  {
        System.out.println("---hello world----");
            throw new StudentException("自定义异常");
    }

    public static void main(String[] args) {
        try {
            m1();
        } catch (StudentException e) {
            e.printStackTrace();
        }
    }
}
