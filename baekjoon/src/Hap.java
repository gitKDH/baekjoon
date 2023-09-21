import java.util.Scanner;

public class Hap {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int n = value.nextInt();
        int hap = 0;

        for (int i = 0; i <= n; i++){
            hap += i;
        }
        System.out.println(hap);
    }
}
