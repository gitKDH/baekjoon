import java.util.Scanner;

public class B2443 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = n * 2; k > i*2+1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
