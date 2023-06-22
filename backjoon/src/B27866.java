import java.util.Scanner;

public class B27866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] a = scanner.next().split("");
        int b = scanner.nextInt();

        System.out.println(a[b-1]);
    }
}