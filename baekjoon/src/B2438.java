import java.util.Scanner;

public class B2438 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for(int x = 0; x < N; x++){
            for(int y = 0; y<=x; y++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
