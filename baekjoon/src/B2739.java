import java.util.Scanner;

public class B2739 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int x = 1; x <= 9; x++){
            System.out.println(N + " * " + x + " = " + N*x);
        }
    }
}
