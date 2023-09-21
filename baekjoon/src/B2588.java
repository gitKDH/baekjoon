import java.util.Scanner;

public class B2588 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int A = value.nextInt();
        int B = value.nextInt();

        System.out.println(A * (B%10));
        System.out.println(A * ((B%100)/10));
        System.out.println(A * (B/100));
        System.out.println(A * B);
    }
}
