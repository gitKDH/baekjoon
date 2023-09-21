import java.util.Scanner;

public class B1978 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int isPrime = 0;
        int count = 0;

        for(int i = 0; i < N; i++){
            isPrime = input.nextInt();
            for(int j = 2; j <= isPrime; j++){
                if(j == isPrime){
                    count++;
                }
                if(isPrime % j == 0){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
