import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(input.readLine());

        int[] stk = new int[N];
        int end = 0;
        int sum = 0;


        for (int i = 0; i < N; i++) {

            int money = Integer.parseInt(input.readLine());

            if (money == 0) {
                --end;
                stk[end] = 0;
                continue;
            }
            stk[end] = money;
            end++;
        }
        for (int i = 0; i < N; i++) {
            sum += stk[i];
        }
        System.out.println(sum);
    }
}
