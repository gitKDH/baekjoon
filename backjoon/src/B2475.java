import java.util.Scanner;

public class B2475 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int a = value.nextInt();
        int b = value.nextInt();
        int c = value.nextInt();
        int d = value.nextInt();
        int e = value.nextInt();
        int f = (int) ((Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)+Math.pow(d,2)+Math.pow(e,2))%10);
        System.out.println(f);
    }
}
