import java.util.Scanner;

public class B25314 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int n = value.nextInt();
        int div = n/4;

        for(int i = 0; i < div; i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
