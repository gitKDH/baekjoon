import java.util.Scanner;

public class B2798 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] card = new int[N];

        int M = input.nextInt();

        int result = 0;

        for (int i = 0; i < N; i++) {
            card[i] = input.nextInt();
        }
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (card[i] + card[j] + card[k] >= result && card[i] + card[j] + card[k] <= M) {
                        result = card[i] + card[j] + card[k];
                    }
                }
            }
        }
        System.out.print(result);
    }
}
