import java.util.Scanner;

public class B2869 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int A = value.nextInt();
        int B = value.nextInt();
        int V = value.nextInt();

        int day = (V - B) / (A - B);

        // 나머지가 있을 경우 (잔여 블럭이 있을 경우)
        if ((V - B) % (A - B) != 0) {
            day++;
        }
        System.out.println(day);
    }
}
