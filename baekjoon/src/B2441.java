import java.util.Scanner;

public class B2441 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (n+1)-i; k++){
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
