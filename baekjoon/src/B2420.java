import java.util.Scanner;

public class B2420 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        long n = value.nextLong();
        long m = value.nextLong();
        long c = n - m;
        long d = Math.abs(c);

        System.out.println(d);
    }
}
