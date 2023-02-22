import java.util.Scanner;

public class CaseT {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int t = value.nextInt();

        for(int i = 0; i < t; i++){
            int a = value.nextInt();
            int b = value.nextInt();
            int c = a + b;
            System.out.println(c);
        }
    }
}
