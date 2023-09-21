import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int a = value.nextInt();
        int b = value.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
