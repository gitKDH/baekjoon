import java.util.Scanner;

public class CardConv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String a = Integer.toBinaryString(n);
        String b = Integer.toOctalString(n);
        String c = Integer.toHexString(n);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
