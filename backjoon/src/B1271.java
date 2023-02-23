import java.math.BigInteger;
import java.util.Scanner;

public class B1271 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);


        BigInteger a = value.nextBigInteger();
        BigInteger b = value.nextBigInteger();
        BigInteger c = a.divide(b);
        BigInteger d = a.mod(b);

        System.out.println(c);
        System.out.println(d);
    }
}
