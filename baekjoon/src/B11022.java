import java.util.Scanner;

public class B11022 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int n = value.nextInt();
        for(int i = 1; i <= n; i++){
            int a = value.nextInt();
            int b = value.nextInt();
            int c = a+b;
            System.out.println("Case #"+i+": "+a+" + "+b+" = "+c);
        }
    }
}
