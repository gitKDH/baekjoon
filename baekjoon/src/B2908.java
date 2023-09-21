import java.util.Arrays;
import java.util.Scanner;

public class B2908 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        String B = input.next();

        char[] Achar = A.toCharArray();
        char[] Bchar = B.toCharArray();

        char Atemp = Achar[0];
        Achar[0] = Achar[2];
        Achar[2] = Atemp;

        char Btemp = Bchar[0];
        Bchar[0] = Bchar[2];
        Bchar[2] = Btemp;

        A = new String(Achar);
        B = new String(Bchar);

        int resultA = Integer.parseInt(A);
        int resultB = Integer.parseInt(B);

        System.out.println(Math.max(resultA,resultB));

    }
}
