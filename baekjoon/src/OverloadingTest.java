public class OverloadingTest {
    public static void main(String[] args) {
        OverloadingTest1 ob = new OverloadingTest1();

        ob.test();

        ob.test(1,22);

        ob.test(100.1);
    }
    static class OverloadingTest1{
        void test(){
            System.out.println("매개변수 없음");
        }
        void test(int a, int b){
            System.out.println("매개변수 "+a+"와"+b);
        }
        void test(double d){
            System.out.println("매개변수 " + d);
        }
    }
}
