import java.util.Scanner;

public class Bfactorial {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int n = value.nextInt();
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        System.out.println(result);
    }
}
