import java.util.Scanner;

public class B15964 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int a = value.nextInt();
        int b = value.nextInt();
        int c = (a+b)*(a-b);
        System.out.println(c);
    }
}
