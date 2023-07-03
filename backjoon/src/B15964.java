import java.util.Scanner;

public class B15964 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        long a = value.nextInt();
        long b = value.nextInt();
        long c = (a+b)*(a-b);
        System.out.println(c);
    }
}
