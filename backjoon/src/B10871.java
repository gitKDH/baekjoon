import java.util.Scanner;

public class B10871 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int X = input.nextInt();
        int[] result = new int[N];

        for(int i = 0; i < N; i++){
            result[i] = input.nextInt();
        }
        for(int i = 0; i < N; i++){
            if(result[i]<X){
                System.out.print(result[i]);
                System.out.print(" ");
            }
        }
    }
}
