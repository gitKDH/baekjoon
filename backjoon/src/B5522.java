import java.util.Scanner;

public class B5522 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int result = 0;

        for(int i = 0; i < 5; i++){
            int a = value.nextInt();
            result += a;
        }
        System.out.println(result);
    }
}
