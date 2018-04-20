public class TestOutClass {
    private Integer id;
    public static String name="zhangsan";
    public TestOutClass(Integer id) {
        this.id = id;
    }

    //成员内部类
    static class InnerClass{
        public final static Integer LAST_CHECk_id =1;
        public void show(){
            System.out.println(TestOutClass.name);
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass =  new TestOutClass. InnerClass();
        innerClass.show();

        Integer integer = Integer.valueOf(1);
        System.out.println(integer.intValue());


    }
}
