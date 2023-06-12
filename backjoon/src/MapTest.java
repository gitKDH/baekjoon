import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args){
        Map<String, Test> map = new HashMap<>();

        Test test = new Test();

        map.put("a",test);

        System.out.println("결과 1 : " + map.get("a").getA());

        test.setA(100);

        System.out.println("결괴 2 : " + map.get("a").getA());
    }

    static class Test{
        int a;

        public int getA(){
            return a;
        }

        public void setA(int a){
            this.a=a;
        }
    }
}
