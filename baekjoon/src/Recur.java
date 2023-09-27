import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recur {
    static void recur(int n){
        if(n > 0){
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(input.readLine());
        recur(x);
    }
}
