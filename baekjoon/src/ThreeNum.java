import java.util.Scanner;

public class ThreeNum {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int a = value.nextInt();
        int b = value.nextInt();
        int c = value.nextInt();
        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c) * (b%c))%c);
    }
}
