import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());
        int sum = 0;
        String[] x = input.readLine().split("");
        for(int i = 0; i < n; i++){
            sum += Integer.parseInt(x[i]);
        }
        System.out.println(sum);
    }
}
