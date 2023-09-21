import java.math.BigInteger;
import java.util.Scanner;

public class B13277 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        BigInteger a = value.nextBigInteger();
        BigInteger b = value.nextBigInteger();

        System.out.println(a.multiply(b));
    }
}
