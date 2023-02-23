import java.math.BigInteger;
import java.util.Scanner;

public class B2338 {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);

        BigInteger a = value.nextBigInteger();
        BigInteger b = value.nextBigInteger();
        BigInteger c = a.add(b);
        BigInteger d = a.subtract(b);
        BigInteger e = a.multiply(b);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
