import java.util.Scanner;

public class B2438 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int n = value.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
