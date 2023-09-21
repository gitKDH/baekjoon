import java.util.Scanner;

public class B2439 {
    public static void main(String[] args) {
        Scanner value =  new Scanner(System.in);
        int a = value.nextInt();
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= a-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <=i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
