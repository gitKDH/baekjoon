import java.util.Scanner;

public class B10950 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();

        for(int x=0; x<T; x++){
            int A = input.nextInt();
            int B = input.nextInt();
            System.out.println(A+B);
        }
    }
}
