import java.util.Scanner;

public class B3046 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int R1 = value.nextInt();
        int result = value.nextInt();

        int R2 = result*2-R1;

        System.out.println(R2);
    }
}
