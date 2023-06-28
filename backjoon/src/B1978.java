import java.util.Scanner;

public class B1978 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int n = value.nextInt();
        int sum = 0;
        int pn;
        for (int i = 0; i < n; i++) {
            pn = value.nextInt();
            for (int p = 2; p <= pn; p++) {
                if (p == pn) {
                    sum += 1;
                }
                if (pn % p == 0) {
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
