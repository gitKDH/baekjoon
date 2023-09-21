import java.util.Scanner;

public class SumGauss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int sum = (n+1) * (n/2) + (n % 2 == 1 ? (n+1)/2 : 0);
        System.out.println(sum);
    }
}
