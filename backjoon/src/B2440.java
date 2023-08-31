import java.util.Scanner;

public class B2440 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int n = value.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

